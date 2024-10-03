package exerciciospratica.relacionamentoclasses;

public class TesteSemRelacionamentoClasses {

	public static void main(String[] args) {
		
		Contato contato =new Contato();
		contato.setNome("Jose");
		contato.setEndereco("Blumenau");
		contato.setTelefone("999999999");
		
		
		//Teste saida no console
		System.out.println(contato.getNome());
		System.out.println(contato.getEndereco());
		System.out.println(contato.getTelefone());
		
	}

}
