package javabasico;
import java.util.Scanner;
public class lista5ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =0;
		while (n<3) {
		System.out.println("Senha = ");
		String senha = scan.nextLine();
		if ("adm123".equals(senha)) {
			System.out.println("Senha esta correta!");
			break;
		}else {
			n++;
			System.out.println("Senha incorreta, tentativas restantes: " + (3-n));
		}
		scan.close();
		}
	}

}
