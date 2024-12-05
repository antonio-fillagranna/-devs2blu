package TransacaoBancaria;
import Strategy.*;

public class TransacaoConcluida {
	private Transacao transacao = new Transacao();
	private MetodoPagamento metodoPagamento;
	
	public void RealizarPagamento(Double valor) {
		metodoPagamento.processarPagamento(valor);
	}
	
	public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	
	
	public void concluirTransacao() {
		System.out.println("");
		System.out.println("Transacao concluida com sucesso!");
		transacao.getTipo();
		transacao.getValor();
		setMetodoPagamento(transacao.getTipo());
		RealizarPagamento(transacao.getValor());
		
	}
	
	//Getters e Setters
	
	public Transacao getTransacao() {
		return transacao;
	}
	public void setTransacao(Transacao transacao) {
		this.transacao = transacao;
	}
}
