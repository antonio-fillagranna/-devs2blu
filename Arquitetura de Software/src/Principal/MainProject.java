package Principal;

import java.util.ArrayList;
import java.util.List;

import Setores.Financeiro;
import Setores.Setor;
import model.Endereco;
import pessoa.Pessoa;

public class MainProject {
	public static void main(String[] args) {
		Endereco enderecoA = new Endereco("100", "Jabuti", "tortuga", "casa da praia", "SC", "99945546-25");
		Setor financeiro = new Financeiro(01, "8h00");
		List<String> telefones = new ArrayList<String>();
		telefones.add("47 9 9999-9999");
		
		
		Pessoa alberto = new Pessoa("Alberto", enderecoA, financeiro, 1000.00, "albertoJabuti@gmail.com", "23/05/2000", telefones, "100.011.500-25");
		
		
		
		System.out.println(alberto);
	}
}
