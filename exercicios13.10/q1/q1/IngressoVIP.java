class IngressoVIP extends Ingresso {
    protected double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do Ingresso VIP: R$ " + valorTotal());
    }

    @Override
    public void imprimeTipo() {
        System.out.println("Tipo de Ingresso: VIP");
    }

    @Override
    public double valorTotal() {
        return valor + valorAdicional;
    }
}