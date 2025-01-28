package alan.aula;

public class SistemaFaturamento {
    // Método para registrar venda
    public static void registrarVenda(String cliente, String endereco, Produto produto) {
        System.out.println("Venda registrada:");
        System.out.println("Cliente: " + cliente);
        System.out.println("Endereço: " + endereco);
        System.out.println("Produto: " + produto.getNome() + " - Quantidade: " + produto.getQuantidade());
    }
}
