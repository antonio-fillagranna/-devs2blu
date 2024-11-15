/* Lógico_1: */

CREATE TABLE tb_clientes (
    idcliente serial PRIMARY KEY,
    nome VARCHAR(40)
);

CREATE TABLE tb_produtos (
    idproduto serial PRIMARY KEY,
    descricao varchar(80),
    valor numeric(12,2)
);

CREATE TABLE tb_pedidos (
    idpedido serial PRIMARY KEY,
    data DATE,
    idcliente serial
);

CREATE TABLE tb_pedidositens (
    idpedido int,
    idproduto int,
    quantidade numeric(12,2),
    valorunitario numeric(12,2)
);

CREATE TABLE tb_categorias (
    id serial PRIMARY KEY,
    nome varchar(100)
);
  
ALTER TABLE tb_pedidos ADD CONSTRAINT FK_tb_pedidos
    FOREIGN KEY (idcliente)
    REFERENCES tb_clientes (idcliente);

ALTER TABLE tb_pedidositens ADD CONSTRAINT FK_tb_pedido
    FOREIGN KEY (idpedido)
    REFERENCES tb_pedidos (idpedido);
	
ALTER TABLE tb_pedidositens ADD CONSTRAINT FK_tb_produto
    FOREIGN KEY (idproduto)
    REFERENCES tb_produtos (idproduto);