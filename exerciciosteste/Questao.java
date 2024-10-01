package exerciciosteste;

import java.util.List;

public class Questao {
	private String enunciado;
	private int bimestre;
	private Materia materia;
	private List<String> alternativas;
    private String respostaCorreta;

    public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public int getBimestre() {
		return bimestre;
	}

	public void setBimestre(int bimestre) {
		this.bimestre = bimestre;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public List<String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<String> alternativas) {
		this.alternativas = alternativas;
	}

	public String getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(String respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}

	public Questao(String enunciado, int bimestre, Materia materia, List<String> alternativas, String respostaCorreta) {
        this.enunciado = enunciado;
        this.bimestre = bimestre;
        this.materia = materia;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }
}
