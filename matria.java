package POO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

// Classe Materia
class Materia {
    private String nome;
    private int serie;

    public Materia(String nome, int serie) {
        this.nome = nome;
        this.serie = serie;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}

// Classe Questao
class Questao {
    private String enunciado;
    private int bimestre;
    private Materia materia;
    private List<String> alternativas;
    private String respostaCorreta;

    public Questao(String enunciado, int bimestre, Materia materia, List<String> alternativas, String respostaCorreta) {
        this.enunciado = enunciado;
        this.bimestre = bimestre;
        this.materia = materia;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    // Getters e Setters
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
}

// Classe Disciplina
class Disciplina {
    private String nome;
    private List<Questao> listaQuestoes;

    public Disciplina(String nome) {
        this.nome = nome;
        this.listaQuestoes = new ArrayList<>();
    }

    // Adiciona questão à lista de questões da disciplina
    public void adicionarQuestao(Questao questao) {
        listaQuestoes.add(questao);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Questao> getListaQuestoes() {
        return listaQuestoes;
    }
}

// Classe Teste
class Teste {
    private Date dataGeracao;
    private Disciplina disciplina;
    private int numeroQuestoes;
    private List<Questao> questoes;

    public Teste(Disciplina disciplina, int numeroQuestoes) {
        this.dataGeracao = new Date();
        this.disciplina = disciplina;
        this.numeroQuestoes = numeroQuestoes;
        this.questoes = new ArrayList<>();
    }

    // Método para gerar um teste aleatório
    public void gerarTesteAleatorio() {
        List<Questao> listaQuestoes = disciplina.getListaQuestoes();
        Random random = new Random();

        for (int i = 0; i < numeroQuestoes; i++) {
            int indiceAleatorio = random.nextInt(listaQuestoes.size());
            questoes.add(listaQuestoes.get(indiceAleatorio));
        }
    }

    // Método para corrigir o teste (retorna o número de acertos)
    public int corrigirTeste(List<String> respostasAluno) {
        int acertos = 0;
        for (int i = 0; i < questoes.size(); i++) {
            if (questoes.get(i).getRespostaCorreta().equals(respostasAluno.get(i))) {
                acertos++;
            }
        }
        return acertos;
    }

    // Getters e Setters
    public Date getDataGeracao() {
        return dataGeracao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public int getNumeroQuestoes() {
        return numeroQuestoes;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }
}
