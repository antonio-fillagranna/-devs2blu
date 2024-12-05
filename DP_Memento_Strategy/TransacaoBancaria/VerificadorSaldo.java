package TransacaoBancaria;

public class VerificadorSaldo extends Autorizador{

	@Override
	public void autorizar(Transacao transacao) {
		if (transacao.getSaldoDisponivel() >= transacao.getValor()) {
			System.out.println("Saldo suficiente para a transação.");
			if(proximo != null)proximo.autorizar(transacao);
		} else {
			System.out.println("Erro: Saldo insuficiente.");
		}
	}
}
