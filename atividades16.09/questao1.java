package javabasico;

import java.util.Scanner;

public class questao1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Digite o Cateto adjacente e depois o oposto=");
		double c1 = scan.nextFloat();
		double c2 = scan.nextFloat();
		double h = Math.pow(Math.pow(c1, 2)+Math.pow(c2, 2), 0.5);
		System.out.println("Hipotenusa=" + h);
		
	}

}
