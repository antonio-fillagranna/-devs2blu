package aluguelfesta;

public class Aluguel {
    private  Cliente cliente;
    private  Tema tema;
    private  String dataFesta;
    private  String horaInicio;
    private  String horaTermino;
    private  double valorCobrado;

    public Aluguel(Cliente cliente, Tema tema, String dataFesta, String horaInicio, String horaTermino, double valorCobrado) {
        this.cliente = cliente;
        this.tema = tema;
        this.dataFesta = dataFesta;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.valorCobrado = valorCobrado;
    }
    
    public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public String getDataFesta() {
		return dataFesta;
	}

	public void setDataFesta(String dataFesta) {
		this.dataFesta = dataFesta;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraTermino() {
		return horaTermino;
	}

	public void setHoraTermino(String horaTermino) {
		this.horaTermino = horaTermino;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	public double calcularValorComDesconto(double desconto) {
        return valorCobrado - (valorCobrado * desconto / 100);
    }
}
