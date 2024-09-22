package javabasico;

public class questao3 {

	public static void main(String[] args) {
		int na = 1000;
		double v1a = 32.87;
		double v2a = 33.92;
		System.out.println("a) Valor pago açoes = " + na*v1a);
		System.out.println("b) Valor pago comissão = " + na*v1a*0.02);
		System.out.println("c) Valor vendido açoes = " + na*v2a);
		System.out.println("d) Valor pago corretagem venda = " + na*v2a*0.02);
		System.out.println("e) Valor ganho ao vender = " + na*v2a*0.98);
	}

}
