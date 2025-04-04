class CamaroteSuperior extends IngressoVIP {
    private String localizacao;

    public CamaroteSuperior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do Ingresso Camarote Superior: R$ " + valorTotal());
    }

    @Override
    public void imprimeTipo() {
        System.out.println("Tipo de Ingresso: Camarote Superior - Localização: " + localizacao);
    }

    @Override
    public double valorTotal() {
        return super.valorTotal();
    }
}