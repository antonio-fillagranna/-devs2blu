package TransacaoBancaria;

public class VerificadorHorario extends Autorizador{

	@Override
	public void autorizar(Transacao transacao) {
		if(transacao.getHoraTransacao().isAfter(transacao.getHorarioLimiteIncio()) 
				&& transacao.getHoraTransacao().isBefore(transacao.getHorarioLimiteFim())) {
			System.out.println("Horário de transacao válido.");
			if(proximo != null) {
				proximo.autorizar(transacao);
			}else {
				TransacaoConcluida transacaoC = new TransacaoConcluida();
				transacaoC.setTransacao(transacao);
				transacaoC.concluirTransacao();
			}
		} else {
			System.out.println("Erro: Transacao fora do horario permitido.");
		}
	}
}
