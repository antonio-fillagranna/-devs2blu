package pessoa;

import java.util.List;

import Setores.Setor;
import model.Endereco;

public class Pessoa {
	
	private String nome;
	private Endereco endereco;
	private Setor setor;
	private double salario;
	private String email;
	private String dataNascimento;
	private List<String> telefones;
	private String cpf;
	private String cnh;
	private String oab;
	
	public Pessoa(String nome, Endereco endereco, Setor setor, double salario, String email, String dataNascimento,
			List<String> telefones, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.setor = setor;
		this.salario = salario;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.telefones = telefones;
		this.cpf = cpf;
	}
	
	
	
	
	public String getOab() {
		return oab;
	}




	public void setOab(String oab) {
		this.oab = oab;
	}




	public String getCnh() {
		return cnh;
	}

	

	public void setCnh(String cnh) {
		this.cnh = cnh;
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

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String CpfValidate() {
		int som1 = 0, som2 = 0, dig1 = 0, dig2 = 0;
		for (int i=0;i<9;i++) {
			
			som1+=Character.getNumericValue(cpf.charAt(i))*(i+1);
			
			System.out.println(som1);
		}
		System.out.println(som1);
		dig1 = som1%11;
		System.out.println(dig1);
		if (dig1 == 10) {
			dig1=0;
		}
		cpf += dig1;
		for (int i=0;i<10;i++) {
			
			som2+=Character.getNumericValue(cpf.charAt(i))*(i);
		}
		dig2 = som2%11;
		if (dig2 == 10) {
			dig2=0;
		}
		cpf+=dig2;
		return cpf;
	}
	
    public boolean validarEmail() {
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                              "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if (!email.matches(emailPattern)) {
            return false;
        }else {
        	return true;
        }
    }
    
    public boolean validarCnh() {
        String cnhPattern = "^[0-9]{11}$";
        if (cnh == null) {
            return false;
        }
        return cnh.matches(cnhPattern);
    }
    
    public boolean validarOab() {
        String oabPattern = "^[A-Za-z]{2}[0-9]{6}$";
        if (oab == null) {
            return false;
        }
        return oab.matches(oabPattern);
    }

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", setor=" + setor + ", salario=" + salario
				+ ", email=" + email + ", dataNascimento=" + dataNascimento + ", telefones=" + telefones + ", cpf="
				+ cpf + "cnh="+cnh+ "oab"+oab+"]";
	}
	
	
	
	
	
	
}
