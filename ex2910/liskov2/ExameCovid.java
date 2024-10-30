package liskov2;

class ExameCovid extends Exame {

    public ExameCovid(String nomePaciente) {
        super(nomePaciente);
    }

    @Override
    public String realizarExame() {
        return "Resultado do Exame de COVID-19 para o paciente " + nomePaciente + ": Negativo.";
    }
}