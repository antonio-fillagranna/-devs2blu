package liskov1;

public class PagamentoCartao extends Pagamento{
	private double valor;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public PagamentoCartao() {
	}
	public PagamentoCartao(double valor) {
		this.valor = valor;
	}
	@Override
	public void processarPagamento() {
		System.out.println("Pagamento Cartão");
		
	}

}
