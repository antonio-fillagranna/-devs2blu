package liskov1;

public class PagamentoPix extends Pagamento{
	private double valor;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public PagamentoPix() {
	}
	public PagamentoPix(double valor) {
		this.valor = valor;
	}
	@Override
	public void processarPagamento() {
		System.out.println("Pagamento Pix");
		
	}

}
