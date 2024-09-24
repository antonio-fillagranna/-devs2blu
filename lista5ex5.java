package javabasico;
import java.util.Scanner;
public class lista5ex5 {

	public static void main(String[] args) {
		boolean errado = true;
		while(errado) {
			int resposta = (int)(Math.random() * 11);
			Scanner scan = new Scanner(System.in);
			System.out.println("Tente adivinhar o número (entre 1 e 10):");
			int tentativa = scan.nextInt();
			if (resposta == tentativa) {
				System.out.println("Acertou!");
				errado = false;
			}else {
				System.out.println("Errou, tente novamente! Número correto esta vez era: " + resposta);
			}
			scan.close();
		}
	}

}
