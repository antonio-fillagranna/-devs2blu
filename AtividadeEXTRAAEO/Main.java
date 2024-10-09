public class Main {
    public static void main(String[] args) {
        Categoria ficcao = new Categoria("Ficção");
        Categoria ciencia = new Categoria("Ciência");

        Autor autor1 = new Autor("George Orwell");
        Autor autor2 = new Autor("Isaac Newton");

        Livro livro1 = new Livro("1984", autor1, ficcao);
        Livro livro2 = new Livro("A Revolução dos Bichos", autor1, ficcao);
        Livro livro3 = new Livro("Principia Mathematica", autor2, ciencia);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.listarLivros();
    }
}
