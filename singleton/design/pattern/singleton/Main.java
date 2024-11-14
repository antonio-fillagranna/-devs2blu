package design.pattern.singleton;

public class Main {
	
	public static void conexao1() {
		Database database = Database.getInstance();
		database.write("Lucas, Oliveira, lucas@oliveira.com");
		database.write("Amanda, Machado, amanda.machado@gmail.com");
	}

	public static void conexao2() {
		Database database = Database.getInstance();
		database.write("Jean, Armando, jean@terra.com.br");
		database.read();
	}
	
	public static void main(String[] args) {
		conexao1();
		conexao2();
	
		Database database = Database.getInstance();
		System.out.println(database.read());
	}

}
