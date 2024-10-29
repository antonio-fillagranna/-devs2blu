package EX1;

import java.util.List;


public class CalculadoraDesconto {
	
	public double calcularDesconto(Produto produto, Desconto desconto) {
	        return desconto.calcularDesconto(produto);
	}
	
	public double calcularDescontoTotal(List<Produto> produtos, List<Desconto> descontos) {
        double totalDesconto = 0;
        double desconto = 0;
        
        for (int i = 0; i < produtos.size(); i++) {
        	
        	System.out.printf("PRODUTO : %s , PRECO : %s "
        			, produtos.get(i).getTipoProduto()
        			, produtos.get(i).getPreco()
        			);
        	
        	desconto = descontos.get(i).calcularDesconto(produtos.get(i));
            totalDesconto += desconto;
            
        	System.out.printf("DESCONTO : %s \n" , desconto);
        }
        return totalDesconto;
    }
	
}
