package javabasico;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Digite na respectiva ordem os coeficientes a,b,c,d,e,f = ");
		double a = scan.nextFloat();
		double b = scan.nextFloat();
		double c = scan.nextFloat();
		double d = scan.nextFloat();
		double e = scan.nextFloat();
		double f = scan.nextFloat();
		double y = (a*f- c*d)/(a*e - b*d);
		double x = (c*e - b*f)/(a*e - b*d);
		System.out.println("Valor de X = " + x);
		System.out.println("Valor de Y = " + y);
	}

}
