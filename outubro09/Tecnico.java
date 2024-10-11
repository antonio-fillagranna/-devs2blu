package outubro09;

public class Tecnico extends Assistente {
	public Tecnico(String nome, double salario) {
		super(nome, salario);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void exibeDados() {
		System.out.println("Nome tecnico = " + nome);
		System.out.println("Salário tecnico R$ = " + salario);
	}
}
