package exerciciospratica.relacionamentoclasses;

public class TesteRelacionamentoClasses {

	public static void main(String[] args) {
		
		ContatoComRelacionamentoTemUm contato =new ContatoComRelacionamentoTemUm();
		contato.setNome("Jose");	
		
		//relacionamento tem-um ENDERECO
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua das Flores");
		endereco.setNumero("n/a");
		endereco.setComplemento("-");
		endereco.setCidade("Blumenau");
		endereco.setEstado("Santa Catarina");
		endereco.setCep("89041000");
		
		//relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("47");
		telefone.setNumero("999999999");

		
		//adiciona endereco e telefone ao contato
		contato.setEndereco(endereco);
		contato.setTelefone(telefone);
		
		//Teste saida no console
		System.out.println(contato.getNome());
		//System.out.println(contato.getEndereco().getNomeRua()
		//System.out.println(contato.getTelefone().getTipo());
		
		// verifica se contato e endereco não está vazio para evitar erro de nullPointer
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getNomeRua());
			System.out.println(contato.getEndereco().getNumero());
			System.out.println(contato.getEndereco().getCidade());
			System.out.println(contato.getEndereco().getEstado());
		}
		
		// verifica se contato e telefone não está vazio para evitar erro de nullPointer
		if(contato != null && contato.getTelefone()!= null) {
			System.out.println(contato.getTelefone().getTipo());
			System.out.println(contato.getTelefone().getDdd() + " " +contato.getTelefone().getNumero());
			
		}
		
		
		
		/*ContatoComRelacionamentoTemMuitos contato =new ContatoComRelacionamentoTemMuitos();
		contato.setNome("Jose");	
		
		//relacionamento tem-um ENDERECO
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua das Flores");
		endereco.setNumero("n/a");
		endereco.setComplemento("-");
		endereco.setCidade("Blumenau");
		endereco.setEstado("Santa Catarina");
		endereco.setCep("89041000");
		
		//relacionamento tem-MUITOS telefones
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("47");
		telefone.setNumero("999999999");
	
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("47");
		telefone2.setNumero("88888-8888");
		
		Telefone[] telefones =new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		
		//adiciona endereco e telefone ao contato
		contato.setEndereco(endereco);
		contato.setTelefones(telefones);
		
		//Teste saida no console
		System.out.println(contato.getNome());
		
		
		// verifica se contato e endereco não está vazio para evitar erro de nullPointer
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getNomeRua());
			System.out.println(contato.getEndereco().getNumero());
			System.out.println(contato.getEndereco().getCidade());
			System.out.println(contato.getEndereco().getEstado());
		}
		
		// verifica se contato e telefone não está vazio para evitar erro de nullPointer
		if(contato != null && contato.getTelefones()!= null){
			for( Telefone t : contato.getTelefones()) {
				System.out.println(t.getTipo() + " " + t.getDdd() + " " + t.getNumero());
			}
			
		}*/
		
		
	}

}
