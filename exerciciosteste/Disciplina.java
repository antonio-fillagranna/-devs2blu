package exerciciosteste;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Questao> listaQuestoes;

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Questao> getListaQuestoes() {
		return listaQuestoes;
	}
	public void setListaQuestoes(List<Questao> listaQuestoes) {
		this.listaQuestoes = listaQuestoes;
	}
	public Disciplina(String nome) {
        this.nome = nome;
        this.listaQuestoes = new ArrayList<>();
    }
    public void adicionarQuestao(Questao questao) {
        listaQuestoes.add(questao);
    }
}
