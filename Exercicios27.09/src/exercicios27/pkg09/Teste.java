package exercicios27.pkg09;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Teste {
    public Date dataGeracao;
    public Disciplina disciplina;
    public int numeroQuestoes;
    public List<Questao> questoes;

    public Teste(Disciplina disciplina, int numeroQuestoes) {
        this.dataGeracao = new Date();
        this.disciplina = disciplina;
        this.numeroQuestoes = numeroQuestoes;
        this.questoes = new ArrayList<>();
    }
    public void gerarTesteAleatorio() {
        List<Questao> listaQuestoes = disciplina.listaQuestoes;
        Random random = new Random();

        for (int i = 0; i < numeroQuestoes; i++) {
            int indiceAleatorio = random.nextInt(listaQuestoes.size());
            questoes.add(listaQuestoes.get(indiceAleatorio));
        }
    }
    public int corrigirTeste(List<String> respostasAluno) {
        int acertos = 0;
        for (int i = 0; i < questoes.size(); i++) {
            if (questoes.get(i).respostaCorreta.equals(respostasAluno.get(i))) {
                acertos++;
            }
        }
        return acertos;
    }
}
