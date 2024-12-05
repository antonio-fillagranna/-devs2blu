package TransacaoBancaria;

public class VerificadorLimiteTransacional extends Autorizador{

	@Override
	public void autorizar(Transacao transacao) {
		if (transacao.getValor() <= transacao.getLimiteTransacional()) {
			System.out.println("Dentro do limite  transacional aprovado.");
			if(proximo!=null)proximo.autorizar(transacao);
		}else {
			System.out.println("Erro: Limite transacional ultrapassado.");
		}
	}
}

