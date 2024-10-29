package EX2;

public class Main {

	public static void main(String[] args) {
		
		Pagamento pgtoBitCoin = new PagamentoBitcoin();
		pgtoBitCoin.processarPagamento();
		Pagamento pgtoCC = new PagamentoCartaoDeCredito();
		pgtoCC.processarPagamento();
		Pagamento pgtoPaypal = new PagamentoPaypal();
		pgtoPaypal.processarPagamento();
		
	}

}