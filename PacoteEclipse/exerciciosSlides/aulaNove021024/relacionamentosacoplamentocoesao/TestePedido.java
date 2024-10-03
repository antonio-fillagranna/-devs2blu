package exerciciosSlides.aulaNove021024.relacionamentosacoplamentocoesao;

public class TestePedido {
	
	public static void main(String[] args) {
        // Testando a classe Pedido com acoplamento forte
        Produto pao = new Produto("Pão", 0.50);
        Pedido pedido = new Pedido(pao);

        // Teste: calcular total para 10 unidades de pão
        double total = pedido.calcularTotal(10);
        System.out.println("Total: R$" + total);  // Esperado: 5.0
    }

}
