import java.util.ArrayList;
import java.util.List;

public class Autor {
        private String nome;
    private List<Livro> livros;

    public Autor(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    // Adiciona um livro à lista de livros escritos pelo autor
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
