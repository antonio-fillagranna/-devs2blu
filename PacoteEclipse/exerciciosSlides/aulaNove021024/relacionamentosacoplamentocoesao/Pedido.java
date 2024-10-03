package exerciciosSlides.aulaNove021024.relacionamentosacoplamentocoesao;

public class Pedido {
	
	    Produto produto;  // Acoplamento forte: Pedido depende diretamente de Produto

	    public Pedido(Produto produto) {
	        this.produto = produto;
	    }

	    public double calcularTotal(int quantidade) {
	        return produto.getPreco() * quantidade;
	    }
	}

