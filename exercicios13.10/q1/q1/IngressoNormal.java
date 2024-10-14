class IngressoNormal extends Ingresso {

    public IngressoNormal(double valor) {
        super(valor);
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do Ingresso Normal: R$ " + valor);
    }

    @Override
    public void imprimeTipo() {
        System.out.println("Tipo de Ingresso: Normal");
    }

    @Override
    public double valorTotal() {
        return valor;
    }
}