package javabasico;

public class lista5ex1 {

	public static void main(String[] args) {
		double alturaInicialChico = 1.5;
		double alturaInicialJuca = 1.1;
		int anos = 0;
		while (alturaInicialChico >= alturaInicialJuca) {
			alturaInicialChico+=0.02;
			alturaInicialJuca+=0.03;
			anos++;
			System.out.println("Chico " + alturaInicialChico + "Juca " + alturaInicialJuca + " ano = " + anos);
		}
	}

}
