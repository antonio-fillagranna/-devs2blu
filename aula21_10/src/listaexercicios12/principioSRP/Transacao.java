package listaexercicios12.principioSRP;

public class Transacao extends ContaTudoEmUm {
	public Transacao(String titular, double saldoInicial) {
		super(titular, saldoInicial);
	}

	public void depositar(double valor) {
        saldo += valor;
        transacoes.add("Dep�sito de: " + valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            transacoes.add("Saque de: " + valor);
        } else {
            transacoes.add("Tentativa de saque sem saldo suficiente: " + valor);
        }
    }

	public void gerarRelatorioSaldo() {
        System.out.println("Relat�rio de Saldo");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
    }

    public void gerarRelatorioTransacoes() {
        System.out.println("Relat�rio de Transa��es");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
    }

    public double obterSaldo() {
        return saldo;
    }
}
