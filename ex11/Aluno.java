package ex11;
class Aluno implements Pesquisador {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return "Aluno";
    }
}