package design.pattern.singleton;

public class Database {
	private static final Database instancia = new Database();
	private String dados;
	
	private Database() {
		this.dados = "";
	}

	public static Database getInstance() {
		return Database.instancia;
	}
	
	public void write(String dados) {
		this.dados += dados+"\n";
	}
	
	public String read() {
		return this.dados;
	}
}
