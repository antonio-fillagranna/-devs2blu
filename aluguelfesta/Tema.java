package aluguelfesta;

import java.util.List;

public class Tema {
	private List<String> itens;
	private double valorAluguel;
	private String corToalha;

    public Tema(List<String> itens, double valorAluguel, String corToalha) {
        this.itens = itens;
        this.valorAluguel = valorAluguel;
        this.corToalha = corToalha;
    }

	public List<String> getItens() {
		return itens;
	}

	public void setItens(List<String> itens) {
		this.itens = itens;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public String getCorToalha() {
		return corToalha;
	}

	public void setCorToalha(String corToalha) {
		this.corToalha = corToalha;
	}
    
}
