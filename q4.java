package javabasico;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		double res = 0;
		Scanner scan = new Scanner(System.in); 
		System.out.println("Entre operação:");
		String operacao = scan.nextLine();
		Scanner scan2 = new Scanner(System.in); 
		System.out.println("Entre valor a :");
		double a = scan2.nextDouble();
		Scanner scan3 = new Scanner(System.in); 
		System.out.println("Entre valor b :");
		double b = scan3.nextDouble();
		
		switch (operacao) {
		case "+": 
			res = a + b;
			System.out.println("Resultado = " + res);
			break;
		case "-": 
			res = a - b;
			System.out.println("Resultado = " + res);
			break;
		case "*": 
			res = a * b;
			System.out.println("Resultado = " + res);
			break;
		case "/": 
			res = a / b;
			System.out.println("Resultado = " + res);
			break;
		}
	}

}
