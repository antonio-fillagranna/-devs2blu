package javabasico;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Lado quadrado = ");
		double lado = scan.nextFloat();
		System.out.println("Área = ");
		System.out.println(Math.pow(lado, 2));
	}

}
