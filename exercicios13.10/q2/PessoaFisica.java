class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {
        double renda = getRendaBruta();
        double imposto = 0;

        if (renda <= 1400) {
            imposto = 0;
        } else if (renda <= 2100) {
            imposto = renda * 0.10 - 100;
        } else if (renda <= 2800) {
            imposto = renda * 0.15 - 270;
        } else if (renda <= 3600) {
            imposto = renda * 0.25 - 500;
        } else {
            imposto = renda * 0.30 - 700;
        }

        return imposto;
    }
}