package exercicios27.pkg09;

public class Aluguel {
    public  Cliente cliente;
    public  Tema tema;
    public  String dataFesta;
    public  String horaInicio;
    public  String horaTermino;
    public  double valorCobrado;

    public Aluguel(Cliente cliente, Tema tema, String dataFesta, String horaInicio, String horaTermino, double valorCobrado) {
        this.cliente = cliente;
        this.tema = tema;
        this.dataFesta = dataFesta;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.valorCobrado = valorCobrado;
    }
    public double calcularValorComDesconto(double desconto) {
        return valorCobrado - (valorCobrado * desconto / 100);
    }
}
