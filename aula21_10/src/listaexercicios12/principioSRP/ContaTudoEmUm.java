package listaexercicios12.principioSRP;

import java.util.ArrayList;
import java.util.List;

public class ContaTudoEmUm {
    protected String titular;
    protected double saldo;
    protected List<String> transacoes;

    public ContaTudoEmUm(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.transacoes = new ArrayList<>();
        transacoes.add("Conta criada com saldo inicial de: " + saldoInicial);
    }

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<String> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<String> transacoes) {
		this.transacoes = transacoes;
	}
}
