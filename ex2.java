import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome do aluno:");
		String nome = scan.nextLine();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Nota 1 = ");
		Double n1 = scan2.nextDouble();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Nota 2 = ");
		Double n2 = scan3.nextDouble();
		
		Scanner scan4 = new Scanner(System.in);
		System.out.println("Nota 3 = ");
		Double n3 = scan4.nextDouble();
		
		Scanner scan5 = new Scanner(System.in);
		System.out.println("Média dos exercicios = ");
		Double me = scan5.nextDouble();
		
		Double media = (n1 + 2*n2 + 3*n3 + me)/7;
		
		System.out.println("Aluno: " + nome);
		System.out.println("Média geral: " + media);
		if (media >= 9) {
			System.out.println("Conceito A");
		}if (media >= 7 & media <=9) {
			System.out.println("Conceito B");
		}if (media >= 6 & media <=7.5) {
			System.out.println("Conceito C");
		}if (media < 6) {
			System.out.println("Conceito D");
		}
		scan.close();
		scan2.close();
		scan3.close();
		scan4.close();
		scan5.close();
	}
}
