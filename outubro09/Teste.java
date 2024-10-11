package outubro09;
public class Teste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Antonio", 5000);
		Assistente as1 = new Assistente("Xico", 2500);
		Tecnico t1 = new Tecnico("Pedro", 2000);
		Administrativo ad1 = new Administrativo("Ryan", 1600);
		f1.exibeDados();
		f1.addAumento(100);
		f1.ganhoAnual();
		as1.exibeDados();
		as1.addAumento(100);
		as1.ganhoAnual();
		t1.exibeDados();
		t1.addAumento(100);
		t1.ganhoAnual();
		ad1.exibeDados();
		ad1.addAumento(100);
		ad1.ganhoAnual();
		System.out.println(Math.PI);
	}
}