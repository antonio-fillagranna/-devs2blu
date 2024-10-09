package q3;

public class Pedido {
    private String cliente;
    private double valorTotal;

    public Pedido(String cliente, double valorTotal) {
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
