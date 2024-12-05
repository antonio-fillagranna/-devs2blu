package MainApplication;

import java.time.LocalTime;
import Memento.ListaTransacoes;
import Memento.TransacaoEditor;
import Strategy.Pix;
import TransacaoBancaria.Autorizador;
import TransacaoBancaria.Transacao;
import TransacaoBancaria.VerificadorHorario;
import TransacaoBancaria.VerificadorLimiteTransacional;
import TransacaoBancaria.VerificadorSaldo;

public class Main {
	public static void main(String[] args) {
		//Definindo Transacao
		Transacao transacao = new Transacao();
		
		//Setando valores transacao
		transacao.setValor(100);
		transacao.setSaldoDisponivel(5000);
		transacao.setLimiteTransacional(3000);
		transacao.setTipo(new Pix());
		//Horarios
		transacao.setHorarioLimiteIncio(LocalTime.of(6, 0));
		transacao.setHorarioLimiteFim(LocalTime.of(18, 0));
		//transacao.setHoraTransacao(LocalTime.now());
		
		LocalTime horaEspecifica = LocalTime.of(14, 30);
		transacao.setHoraTransacao(horaEspecifica);
		
		//Configurando Handlers
		Autorizador verificaSaldo = new VerificadorSaldo();
		Autorizador verificaLimite = new VerificadorLimiteTransacional();
		Autorizador verificaHorario = new VerificadorHorario();
		//Setando o proximo Handler		
		verificaSaldo.setProximo(verificaLimite);
		verificaLimite.setProximo(verificaHorario);
		
		//Chamando a primeira verificação da cadeia (verificador de saldo)
		verificaSaldo.autorizar(transacao);
		
		//Criando Memento e armazenando as informa��es
		TransacaoEditor editor = new TransacaoEditor();
		ListaTransacoes careTaker = new ListaTransacoes();
		
		editor.setTransacao(transacao);
		careTaker.addMemento(editor.saveToMemento());
		System.out.println();
		System.out.println(editor.getTranascao());
		
	}		
}
