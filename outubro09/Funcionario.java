package outubro09;
public class Funcionario {
	public String nome;
	public double salario;
	public Funcionario(String nome,double salario){
		this.nome = nome;
		this.salario = salario;
	}
	public void addAumento(double valor) {
		salario+=valor;
	}
	public void ganhoAnual() {
		System.out.println("TC R$ = " + salario*13);
	}
	public void exibeDados() {
		System.out.println("Nome = " + nome);
		System.out.println("Salário R$ = " + salario);
	}
}