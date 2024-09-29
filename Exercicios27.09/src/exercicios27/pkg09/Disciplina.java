package exercicios27.pkg09;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    public String nome;
    public List<Questao> listaQuestoes;

    public Disciplina(String nome) {
        this.nome = nome;
        this.listaQuestoes = new ArrayList<>();
    }
    public void adicionarQuestao(Questao questao) {
        listaQuestoes.add(questao);
    }
}
