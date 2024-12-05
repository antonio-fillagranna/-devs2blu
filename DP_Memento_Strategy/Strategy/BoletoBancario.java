package Strategy;

//DISTRIBUIÇÃO DO ALGORÍTIMO
public class BoletoBancario implements MetodoPagamento {

	@Override
	public void processarPagamento(Double valor) {
		System.out.println("Pagamento efetuado: R$" + valor + " com boleto bancário");
		 
	}
	
	@Override
	public String toString() {
		return "Boleto";
	}

}
