package fontes;

public class Contato {
	private long id;
	private String nome;
	private String email;
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() < 3) {
			throw new RuntimeException("O nome deve ter no mínimo 3 caracteres");
		}
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(!email.contains("@")) {
			throw new RuntimeException("Email inválido");
		}
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if (senha == null || senha.length() < 5) {
	        throw new RuntimeException("Senha inválida: deve ter pelo menos 5 caracteres.");
	    }

	    if (!senha.matches(".*[A-Z].*")) {
	        throw new RuntimeException("Senha deve conter pelo menos uma letra MAIÚSCULA.");
	    }

	    if (!senha.matches(".*[a-z].*")) {
	        throw new RuntimeException("Senha deve conter pelo menos uma letra minúscula.");
	    }

	    if (!senha.matches(".*\\d.*")) {
	        throw new RuntimeException("Senha deve conter pelo menos um número.");
	    }

	    if (!senha.matches(".*[^a-zA-Z0-9].*")) {
	        throw new RuntimeException("Senha deve conter pelo menos um símbolo.");
	    }

	    this.senha = senha;
	}
}
