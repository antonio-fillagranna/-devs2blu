package liskov2;


public class SistemaLaboratorio {
    public static void main(String[] args) {
        Exame[] exames = new Exame[] {
            new ExameSangue("João"),
            new ExameUrina("Maria"),
            new ExameCovid("Pedro")
        };

        for (Exame exame : exames) {
            System.out.println(exame.realizarExame());
        }
    }
}