package br.com.exemplo.model;

public class PagamentoPaypal implements Pagamento{

	@Override
	public void processarPagamento() {
		System.out.println("Pagamento via Paypal");		
	}


}
