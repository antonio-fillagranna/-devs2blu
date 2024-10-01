package exerciciosteste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Teste {
	private Date dataGeracao;
	private Disciplina disciplina;
	private int numeroQuestoes;
	private List<Questao> questoes;
	

    public Date getDataGeracao() {
		return dataGeracao;
	}
	public void setDataGeracao(Date dataGeracao) {
		this.dataGeracao = dataGeracao;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public int getNumeroQuestoes() {
		return numeroQuestoes;
	}
	public void setNumeroQuestoes(int numeroQuestoes) {
		this.numeroQuestoes = numeroQuestoes;
	}
	public List<Questao> getQuestoes() {
		return questoes;
	}
	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}
	public Teste(Disciplina disciplina, int numeroQuestoes) {
        this.dataGeracao = new Date();
        this.disciplina = disciplina;
        this.numeroQuestoes = numeroQuestoes;
        this.questoes = new ArrayList<>();
    }
    public void gerarTesteAleatorio() {
        List<Questao> listaQuestoes = disciplina.getListaQuestoes();
        Random random = new Random();

        for (int i = 0; i < numeroQuestoes; i++) {
            int indiceAleatorio = random.nextInt(listaQuestoes.size());
            questoes.add(listaQuestoes.get(indiceAleatorio));
        }
    }
    public int corrigirTeste(List<String> respostasAluno) {
        int acertos = 0;
        for (int i = 0; i < questoes.size(); i++) {
            if (questoes.get(i).getRespostaCorreta().equals(respostasAluno.get(i))) {
                acertos++;
            }
        }
        return acertos;
    }
}
