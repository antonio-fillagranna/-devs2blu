package Strategy;

//DISTRIBUIÇÃO DO ALGORÍTIMO
public class Pix implements MetodoPagamento{

	@Override
	public void processarPagamento(Double valor) {
		System.out.println("Pagamento efetuado: R$" + valor + " com PIX");
	}

	@Override
	public String toString() {
		return "Pix";
	}
	
	

}
