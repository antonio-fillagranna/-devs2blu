package EX1;

public class Produto {
	
	private String tipoProduto;
    private double preco;

    public Produto(String tipo, double preco) {
        this.tipoProduto = tipo;
        this.preco = preco;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public double getPreco() {
        return preco;
    }	
}
