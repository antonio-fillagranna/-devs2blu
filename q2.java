package javabasico;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Entre idade do nadador:");
		int idade = scan.nextInt();
		scan.close();
		if (idade > 5 & idade < 7){
			System.out.println("Infantil A");
		}
		else if (idade > 8 & idade < 10) {
			System.out.println("Infantil B");
		}
		else if (idade > 11 & idade < 13) {
			System.out.println("Juvenil A");
		}
		else if (idade > 14 & idade < 17) {
			System.out.println("Juvenil B");
		}
		else {
			System.out.println("Adulto");
		}

	}
}
