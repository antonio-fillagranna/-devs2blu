package exerciciosteste;

import java.util.Arrays;
import java.util.List;

public class TesteGerador {
     public static void main(String[] args) {
        Materia adicao = new Materia("Adição", 1);
        Materia sinonimos = new Materia("Sinônimos", 2);

        Questao questao1 = new Questao("Quanto é 2 + 2?", 1, adicao, Arrays.asList("1", "2", "3", "4"), "4");
        Questao questao2 = new Questao("Qual é o sinônimo de feliz?", 2, sinonimos, Arrays.asList("Triste", "Alegre", "Bravo", "Calmo"), "Alegre");
        
        Disciplina matematica = new Disciplina("Matemática");
        matematica.adicionarQuestao(questao1);
        
        Disciplina portugues = new Disciplina("Português");
        portugues.adicionarQuestao(questao2);
        
        Teste testeMatematica = new Teste(matematica, 1);
        testeMatematica.gerarTesteAleatorio();
        
        for (Questao q : testeMatematica.getQuestoes()) {
            System.out.println("Questão: " + q.getEnunciado());
        }

        List<String> respostasAluno = Arrays.asList("4");
        int acertos = testeMatematica.corrigirTeste(respostasAluno);
        System.out.println("Número de acertos: " + acertos);
    }
}
