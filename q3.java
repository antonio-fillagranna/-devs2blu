package javabasico;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Entre nome da fruta:");
		String fruta = scan.nextLine();
		
		Scanner scan2 = new Scanner(System.in); 
		System.out.println("Entre o preço unitário da fruta:");
		float preco = scan2.nextFloat();
		
		int n = 0;
		switch (fruta) {
		case "laranja": 
			n=60;
			System.out.println("Caixa de Laranjas R$= " + n*preco);
			break;
		case "limao": 
			n=80;
			System.out.println("Caixa de Laranjas R$= " + n*preco);
			break;
		case "morango": 
			n=20;
			System.out.println("Caixa de Laranjas R$= " + n*preco);
			break;
		}
	}

}
