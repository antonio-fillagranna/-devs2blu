package EX1;


public class DescontoRoupa implements Desconto {


	public double calcularDesconto(Produto produto) {
		// TODO Auto-generated method stub
		 return produto.getPreco() * 0.15; 
	}

}
