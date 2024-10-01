package exerciciosteste;

public class Materia {
	private String nome;
	private int serie;

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

	public Materia(String nome, int serie) {
        this.nome = nome;
        this.serie = serie;
    }
}
