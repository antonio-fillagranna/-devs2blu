package liskov2;

abstract class Exame {
    protected String nomePaciente;

    public Exame(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public abstract String realizarExame();
}