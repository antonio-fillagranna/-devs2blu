package TransacaoBancaria;

import java.time.LocalTime;
import Strategy.*;

public class Transacao {
	private double valor;
	private double saldoDisponivel;
	private double limiteTransacional;
	private LocalTime horaTransacao;
	private LocalTime HorarioLimiteIncio = LocalTime.of(6, 0);
	private LocalTime horarioLimiteFim = LocalTime.of(18, 0);
	private MetodoPagamento tipo;	
	
	//Getters e Setters
	
	public double getValor() {
		return valor;
	}
	public MetodoPagamento getTipo() {
		return tipo;
	}
	public void setTipo(MetodoPagamento tipo) {
		this.tipo = tipo;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}
	public void setSaldoDisponivel(double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}
	public double getLimiteTransacional() {
		return limiteTransacional;
	}
	public void setLimiteTransacional(double limiteTransacional) {
		this.limiteTransacional = limiteTransacional;
	}
	public LocalTime getHoraTransacao() {
		return horaTransacao;
	}
	public void setHoraTransacao(LocalTime horaTransacao) {
		this.horaTransacao = horaTransacao;
	}
	public LocalTime getHorarioLimiteIncio() {
		return HorarioLimiteIncio;
	}
	public void setHorarioLimiteIncio(LocalTime horarioLimiteIncio) {
		HorarioLimiteIncio = horarioLimiteIncio;
	}
	public LocalTime getHorarioLimiteFim() {
		return horarioLimiteFim;
	}
	public void setHorarioLimiteFim(LocalTime horarioLimiteFim) {
		this.horarioLimiteFim = horarioLimiteFim;
	}
	@Override
	public String toString() {
		return "Transacao:\n Valor: " + valor + ",\n Saldo disponivel: " + saldoDisponivel + ",\n Limite Transacional: "
				+ limiteTransacional + ",\n Hora Transacao: " + horaTransacao + ",\n Horario Limite Incio: " + HorarioLimiteIncio
				+ ",\n Horario Limite Fim: " + horarioLimiteFim + ",\n Método de Pagamento: " + tipo + "\n";
	}
	
	
	
}
