package outubro09;

public class Administrativo extends Assistente {
	public Administrativo(String nome, double salario) {
		super(nome, salario);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void exibeDados() {
		System.out.println("Nome administrativo = " + nome);
		System.out.println("Salário administrativo R$ = " + salario);
	}
}
