package javabasico;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		double m2toacre = 0.00024711;
		double m2toft2 = 10.7639104;
		double m2tohectar = 0.0001;
		Scanner scan = new Scanner(System.in); 
		System.out.println("Área em m² = ");
		double A = scan.nextFloat();
		System.out.println("Área em Acres = " + A*m2toacre);
		System.out.println("Área em pés quadrados = " + A*m2toft2);
		System.out.println("Área em Hectares = " + A*m2tohectar);
	}

}
