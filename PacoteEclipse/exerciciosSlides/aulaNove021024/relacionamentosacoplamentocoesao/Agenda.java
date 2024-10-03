package exerciciosSlides.aulaNove021024.relacionamentosacoplamentocoesao;

public class Agenda {
	
	private String nome;
	private Contato[] contatos; // relacionamento tem muitos
	
	
	public Contato[] getContato() {
		return contatos;
	}

	public void setContato(Contato[] contato) {
		this.contatos = contato;
	}

	public Agenda() {
		
	}

	public Agenda(String nome){
		this.nome=nome;	
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String obterInfo() {
		
		String info = "Nome = " + nome + "\n";
		
		if(contatos !=null) {
			for(Contato c: contatos) {
				info += c.obterInfo() +  "\n";
			}
		}
		
		return info;
	}
	

}
