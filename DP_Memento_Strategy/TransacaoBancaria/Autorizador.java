package TransacaoBancaria;

public abstract class Autorizador {
	protected Autorizador proximo;
	
	public void setProximo(Autorizador proximo) {
		this.proximo = proximo;
	}
	
	public abstract void autorizar(Transacao transacao);
}
