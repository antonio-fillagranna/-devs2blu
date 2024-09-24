package javabasico;
import java.util.Scanner;
public class lista5ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Limite inferior= ");
		int inicial = scan.nextInt();
		System.out.println("Limite superior= ");
		int fim = scan.nextInt();
		int soma = 0;
		if (inicial%2 == 1) {
			inicial+=1;
		}
		for (int i= inicial; i<fim ;i+=2) {
			soma+=i;
			System.out.println("n = " + i + " / Soma = " + soma);
		}
		scan.close();
	}

}
