package listaexercicios12.principioSRP;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Autor autor = new Autor("George Orwell");
        Livro livro1 = new Livro("1984",autor );
        
        autor.setNome("Miguel de Cervantes");
        Livro livro2 = new Livro("Dom Quixote",autor );

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        livro1.alugar();
        livro2.alugar();

        biblioteca.gerarRelatorioLivros();
    }
}