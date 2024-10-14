abstract class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public abstract void imprimeValor();

    public abstract void imprimeTipo();

    public abstract double valorTotal();
}