package exerciciosSlides.aulaNove021024.relacionamentosacoplamentocoesao;

public class TesteCalculadoraCoesao {
	 public static void main(String[] args) {
	        CalculadoraCoesao calc = new CalculadoraCoesao();

	        // Testando o método de soma
	        System.out.println("Soma: " + calc.somar(10, 5));

	        // Testando o método de subtração
	        System.out.println("Subtração: " + calc.subtrair(10, 5));

	        // Testando o método de multiplicação
	        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));

	        // Testando o método de divisão
	        try {
	            System.out.println("Divisão: " + calc.dividir(10, 5));
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }

	        // Testando a divisão por zero
	        try {
	            System.out.println("Divisão: " + calc.dividir(10, 0));
	        } catch (IllegalArgumentException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	    }

}
