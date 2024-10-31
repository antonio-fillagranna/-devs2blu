package EX1;

class Armazenamento {
    private MecanismoArmazenamento mecanismo;

    public Armazenamento(MecanismoArmazenamento mecanismo) {
        this.mecanismo = mecanismo;
    }

    public void salvarDados(String dados) {
        mecanismo.salvar(dados);
    }
}
