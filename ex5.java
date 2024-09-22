import java.util.Scanner;
public class ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Forma de pagamento (dinheiro ou cheque):");
		String formaPagamento = scan.nextLine();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Valor da compra = ");
		Double valorCompra = scan2.nextDouble();
		
		if ("dinheiro".equals(formaPagamento) & valorCompra >= 100) {
			System.out.println("Compra recebe desconto especial de 10%! Valor com desconto = " + 0.9*valorCompra);
		}else {
			System.out.printf("Valor da compra = " + valorCompra);
		}
		scan.close();
		scan2.close();
	}
}
