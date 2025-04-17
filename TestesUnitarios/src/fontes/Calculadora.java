package fontes;

public class Calculadora {
	public double somar(double n1, double n2) {
		return n1 + n2;
	}
	
	public double dividir(double n1, double n2) {
		if(n2 == 0) {
			throw new RuntimeException("Não é possivel dividir por zero");
		}
		return n1/n2;
	}
}
