package exerciciosSlides.aulaNove021024.relacionamentosacoplamentocoesao;

public class CalculadoraCoesao {	
	
	// M�todo para somar dois n�meros
    public double somar(double a, double b) {
        return a + b;
    }

    // M�todo para subtrair dois n�meros
    public double subtrair(double a, double b) {
        return a - b;
    }

    // M�todo para multiplicar dois n�meros
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // M�todo para dividir dois n�meros
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("O divisor n�o pode ser zero.");
        }
        return a / b;
    }

}
