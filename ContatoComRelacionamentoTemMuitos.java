package exerciciospratica.relacionamentoclasses;

public class ContatoComRelacionamentoTemMuitos {
	
	private String nome;
	private Endereco endereco;
	private Telefone[] telefones; // pode ser substituido pelas collections mais a frente
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	 
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	
	

}
