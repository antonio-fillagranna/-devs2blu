package outubro09;

public class Assistente extends Funcionario {
	public int matricula;
	public Assistente(String nome, double salario) {
		super(nome, salario);
		//TODO Auto-generated constructor stub
	}
	@Override
	public void exibeDados() {
		System.out.println("Nome assistente = " + nome);
		System.out.println("Salário assistente R$ = " + salario);
	}
}
