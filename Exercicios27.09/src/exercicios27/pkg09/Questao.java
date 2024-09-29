package exercicios27.pkg09;

import java.util.List;

public class Questao {
    public String enunciado;
    public int bimestre;
    public Materia materia;
    public List<String> alternativas;
    public String respostaCorreta;

    public Questao(String enunciado, int bimestre, Materia materia, List<String> alternativas, String respostaCorreta) {
        this.enunciado = enunciado;
        this.bimestre = bimestre;
        this.materia = materia;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }
}
