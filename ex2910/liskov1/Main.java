package liskov1;

public class Main {

	public static void main(String[] args) {
		Pagamento p1 = new PagamentoCartao(255.50);
		Pagamento p2 = new PagamentoPix(360.12);
		p1.processarPagamento();
		p2.processarPagamento();
	}

}
