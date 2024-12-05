package Memento;

import TransacaoBancaria.Transacao;

public class TransacaoEditor {
	private Transacao transacao;
	
	public void setTransacao(Transacao transacao) {
		this.transacao = transacao;
	}
	
	public Transacao getTranascao() {
		return transacao;
	}
	
	public Memento saveToMemento() {
		return new Memento(transacao);
	}
	
	public void restoreFromMemento(Memento memento) {
		transacao = memento.getState();
	}
	
	public static class Memento{
		private final Transacao transacao;
		
		public Memento(Transacao transacao) {
			this.transacao = transacao;
		}
		
		private Transacao getState() {
			return transacao;
		}

		@Override
		public String toString() {
			return "Memento [transacao=" + transacao + "]";
		}
		
	}
	
	
}
