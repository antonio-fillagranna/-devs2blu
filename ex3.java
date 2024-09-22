import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre valor do saldo médio do último ano = ");
		Double saldoMedio = scan.nextDouble();
		System.out.println("Saldo médio do último ano = " + saldoMedio);
		if (saldoMedio >= 0 & saldoMedio <= 200) {
			System.out.println("Sem crédito pré aprovado, favor dirigir-se a uma agência para solicitar.");
		}if (saldoMedio >= 201 & saldoMedio <= 400) {
			System.out.println("Crédito pré aprovado = " + 0.2*saldoMedio);
		}if (saldoMedio>= 401 & saldoMedio <= 600) {
			System.out.printf("Crédito pré aprovado = " + 0.3*saldoMedio);
		}if (saldoMedio >= 601) {
			System.out.printf("Crédito pré aprovado = " + 0.4*saldoMedio);
		}
		scan.close();
	}
}
