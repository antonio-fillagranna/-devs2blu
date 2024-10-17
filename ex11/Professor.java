package ex11;

class Professor extends Funcionario implements Pesquisador {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return "Professor";
    }
}