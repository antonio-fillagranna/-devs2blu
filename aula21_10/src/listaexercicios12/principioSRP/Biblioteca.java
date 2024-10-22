package listaexercicios12.principioSRP;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca extends Aluguel {
    private List<Livro> livros = new ArrayList<>(); // Composi��o

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void gerarRelatorioLivros() {
        for (Livro livro : livros) {
            livro.gerarRelatorio();
        }
    }
    
    public void mostrarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }
}