package br.com.exemplo.model;

public class PagamentoCartaoDeCredito implements Pagamento {

	@Override
	public void processarPagamento() {
		System.out.println("Pagamento via cartão de credito");
		
	}
	
}