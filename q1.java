package javabasico;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Entre número positivo qualquer:");
		float n = scan.nextFloat();
		if (n%2 == 0)
			System.out.println("Par!");
		else
			System.out.println("Impar!");
		
		
		scan.close();
	}
}
