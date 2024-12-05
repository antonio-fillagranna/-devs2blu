package Strategy;
//DISTRIBUIÇÃO DO ALGORÍTIMO
public class CartaoCredito implements MetodoPagamento{

	@Override
	public void processarPagamento(Double valor) {
		System.out.println("Pagamento efetuado: R$ " + valor + " com Cartao de Crédito");
		
	}

	@Override
	public String toString() {
		return "Cartao de Crédito";
	}
	
}
