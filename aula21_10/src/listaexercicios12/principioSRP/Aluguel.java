package listaexercicios12.principioSRP;

public class Aluguel {
    protected String titulo;
    private boolean alugado;
    protected Autor autor;

	public Aluguel() {
		super();
	}
	
	public Aluguel(String titulo, boolean alugado, Autor autor) {
		super();
		this.titulo = titulo;
		this.alugado = alugado;
		this.autor = autor;
	}



	public void alugar() {
        if (!alugado) {
            alugado = true;
            System.out.println("O livro " + titulo + " foi alugado.");
        } else {
            System.out.println("O livro " + titulo + " j� est� alugado.");
        }
    }


    public void gerarRelatorio() {
        System.out.println("T�tulo: " + titulo);
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Status: " + (alugado ? "Alugado" : "Dispon�vel"));
    }  
    

}