package exerciciosSlides.aulaNove021024.relacionamentosacoplamentocoesao;

public class TesteCalculadoraCoesao {
	 public static void main(String[] args) {
	        CalculadoraCoesao calc = new CalculadoraCoesao();

	        // Testando o m�todo de soma
	        System.out.println("Soma: " + calc.somar(10, 5));

	        // Testando o m�todo de subtra��o
	        System.out.println("Subtra��o: " + calc.subtrair(10, 5));

	        // Testando o m�todo de multiplica��o
	        System.out.println("Multiplica��o: " + calc.multiplicar(10, 5));

	        // Testando o m�todo de divis�o
	        try {
	            System.out.println("Divis�o: " + calc.dividir(10, 5));
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }

	        // Testando a divis�o por zero
	        try {
	            System.out.println("Divis�o: " + calc.dividir(10, 0));
	        } catch (IllegalArgumentException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	    }

}
