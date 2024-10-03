package exerciciospratica.relacionamentoclasses;

public class ContatoComRelacionamentoTemUm {
	
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	
	ContatoComRelacionamentoTemUm(){
		
	}
	
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
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	

}
