package listaexercicios12.principioSRP;

public class MainContaTudoEmUm {
	
	    public static void main(String[] args) {
	        ContaTudoEmUm conta = new ContaTudoEmUm("Jo�o Silva", 500.0);
	        Transacao t1 = new Transacao(conta.getTitular(),conta.getSaldo());
	        t1.depositar(200.0);
	        t1.sacar(150.0);
	        t1.gerarRelatorioSaldo();
	        t1.gerarRelatorioTransacoes();
	        
	    }
}
