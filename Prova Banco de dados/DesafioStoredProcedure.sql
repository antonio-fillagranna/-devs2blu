--Questão 1
CREATE TABLE LogProdutos ( --tabela
    Id serial PRIMARY KEY,
    ProdutoId int NOT NULL,
    DescricaoAnterior varchar(40),
    PrecoAnterior DECIMAL(6,2),
    EstoqueAnterior DECIMAL(6,2),
    DataModificacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT FK_produto_log FOREIGN KEY (ProdutoId) REFERENCES Produtos (Id)
);

CREATE OR REPLACE FUNCTION registrar_log_produto() --function
RETURNS TRIGGER AS $$
BEGIN
    INSERT INTO LogProdutos (ProdutoId, DescricaoAnterior, PrecoAnterior, EstoqueAnterior)
    VALUES (OLD.Id, OLD.Descricao, OLD.Preco, OLD.Estoque);
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trigger_log_produto --trigger
AFTER UPDATE ON Produtos
FOR EACH ROW
EXECUTE FUNCTION registrar_log_produto();

--Questão 2
ALTER TABLE Pedidos ADD COLUMN Status CHAR(1) DEFAULT 'A'; --adiciona status

CREATE TABLE LogItensPedido ( --cria log da operação itens de pedido
    Id serial PRIMARY KEY,
    PedidoId int NOT NULL,
    ProdutoId int,
    Operacao varchar(20), -- Operações: 'Adicionar', 'Excluir', 'Alterar'
    Quantidade int,
    ValorUnitario DECIMAL(6,2),
    DataOperacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT FK_pedido_log FOREIGN KEY (PedidoId) REFERENCES Pedidos (Id),
    CONSTRAINT FK_produto_log FOREIGN KEY (ProdutoId) REFERENCES Produtos (Id)
);

CREATE OR REPLACE FUNCTION registrar_log_item()
RETURNS TRIGGER AS $$
BEGIN
    IF (TG_OP = 'INSERT') THEN
        INSERT INTO LogItensPedido (PedidoId, ProdutoId, Operacao, Quantidade, ValorUnitario)
        VALUES (NEW.PedidoId, NEW.ProdutoId, 'Adicionar', NEW.Quantidade, NEW.ValorUnitario);
    ELSIF (TG_OP = 'DELETE') THEN
        INSERT INTO LogItensPedido (PedidoId, ProdutoId, Operacao, Quantidade, ValorUnitario)
        VALUES (OLD.PedidoId, OLD.ProdutoId, 'Excluir', OLD.Quantidade, OLD.ValorUnitario);
    ELSIF (TG_OP = 'UPDATE') THEN
        INSERT INTO LogItensPedido (PedidoId, ProdutoId, Operacao, Quantidade, ValorUnitario)
        VALUES (NEW.PedidoId, NEW.ProdutoId, 'Alterar', NEW.Quantidade, NEW.ValorUnitario);
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trigger_log_item_pedido
AFTER INSERT OR UPDATE OR DELETE ON ItensPedido
FOR EACH ROW
EXECUTE FUNCTION registrar_log_item();
--Alteração do estoque ao finalizar pedido
CREATE OR REPLACE FUNCTION atualizar_estoque_produtos()
RETURNS TRIGGER AS $$
BEGIN
    IF NEW.Status = 'F' THEN
        UPDATE Produtos
        SET Estoque = Estoque - (SELECT SUM(Quantidade) FROM ItensPedido WHERE PedidoId = NEW.Id AND ProdutoId = Produtos.Id)
        WHERE Produtos.Id IN (SELECT ProdutoId FROM ItensPedido WHERE PedidoId = NEW.Id);
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trigger_finalizar_pedido
AFTER UPDATE OF Status ON Pedidos
FOR EACH ROW
WHEN (NEW.Status = 'F')
EXECUTE FUNCTION atualizar_estoque_produtos();

--Questão 3
CREATE OR REPLACE FUNCTION cadastrar_produto(
    descricao varchar(40),
    preco DECIMAL(6,2),
    estoque DECIMAL(6,2),
    categoriaId int
) RETURNS void AS $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM Categorias WHERE Id = categoriaId) THEN
        RAISE NOTICE 'Categoria não existe. Verifique o ID da categoria.';
    ELSE
        INSERT INTO Produtos (Descricao, Preco, Estoque, CategoriaId)
        VALUES (descricao, preco, estoque, categoriaId);
    END IF;
END;
$$ LANGUAGE plpgsql;

--Questão 4
CREATE TABLE Parcelas ( --tabela parcelas
    Id serial PRIMARY KEY,
    PedidoId int NOT NULL,
    Valor DECIMAL(6,2),
    DataVencimento DATE,
    NumeroParcela int,
    CONSTRAINT FK_pedido_parcela FOREIGN KEY (PedidoId) REFERENCES Pedidos (Id)
);
--Gera registro parcelas e calcula suas datas e valores
CREATE OR REPLACE FUNCTION gerar_parcelas(pedidoId int, valor_total DECIMAL, num_parcelas int)
RETURNS void AS $$
DECLARE
    valor_parcela DECIMAL(6,2) := valor_total / num_parcelas;
    i int := 1;
BEGIN
    WHILE i <= num_parcelas LOOP
        INSERT INTO Parcelas (PedidoId, Valor, DataVencimento, NumeroParcela)
        VALUES (pedidoId, valor_parcela, CURRENT_DATE + (i * INTERVAL '30 days'), i);
        i := i + 1;
    END LOOP;
END;
$$ LANGUAGE plpgsql;
--gera as parcelas caso pedido for parcelado
CREATE OR REPLACE FUNCTION finalizar_pedido_com_pagamento(pedidoId int, formaPagamento varchar, valor_total DECIMAL, num_parcelas int DEFAULT NULL)
RETURNS void AS $$
BEGIN
    UPDATE Pedidos SET Status = 'F' WHERE Id = pedidoId;

    IF formaPagamento = 'Parcelado' THEN
        PERFORM gerar_parcelas(pedidoId, valor_total, num_parcelas);
    END IF;
END;
$$ LANGUAGE plpgsql;