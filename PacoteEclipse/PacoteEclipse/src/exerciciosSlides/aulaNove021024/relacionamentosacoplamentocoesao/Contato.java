package exerciciosSlides.aulaNove021024.relacionamentosacoplamentocoesao;

public class Contato {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	
	public Contato() {
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String obterInfo() {
		return "Nome = " + nome + ";" +
				"Telefone = " + telefone + ";" +
				"Email = " + email ;
	}
	 

}
