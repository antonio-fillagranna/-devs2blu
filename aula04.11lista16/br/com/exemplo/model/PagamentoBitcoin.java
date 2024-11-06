package br.com.exemplo.model;

public class PagamentoBitcoin implements Pagamento {

	@Override
	public void processarPagamento() {
		System.out.println("Pagamento via Bitcoin");
		
	}

}
