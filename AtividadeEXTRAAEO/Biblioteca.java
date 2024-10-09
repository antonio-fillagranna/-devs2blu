import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> colecaoDeLivros;

    public Biblioteca() {
        this.colecaoDeLivros = new ArrayList<>();
    }

    // Composição: Biblioteca gerencia uma coleção de livros
    public void adicionarLivro(Livro livro) {
        colecaoDeLivros.add(livro);
    }

    public void listarLivros() {
        if (colecaoDeLivros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Lista de livros na biblioteca:");
            for (Livro livro : colecaoDeLivros) {
                System.out.println(livro.toString());
            }
        }
    }
}
