package alan.aula;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Produto> produtos;

    // Construtor
    public Estoque() {
        this.produtos = new HashMap<>();
    }

    // Método para adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos.put(produto.getNome(), produto);
    }

    // Método para consultar produto
    public Produto consultarProduto(String nome) {
        return produtos.get(nome);
    }

    // Método para listar todos os produtos
    public void listarProdutos() {
        for (Produto produto : produtos.values()) {
            System.out.println("Produto: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade());
        }
    }
}
