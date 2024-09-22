package javabasico;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Velocidade (em Km/H) = ");
		double vel = scan.nextFloat();
		System.out.println("Distância percorrida em 5 Horas = " + vel*5 + " km");
		System.out.println("Distância percorrida em 8 Horas = " + vel*8 + " km");
		System.out.println("Distância percorrida em 12 Horas = " + vel*12 + " km");
	}

}
