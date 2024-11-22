package gof.singleton;

public class MainTestes {
	public static void main(String[] args) {

		Database instancia01 = Database.getInstancia();
		
		Database instancia02 = Database.getInstancia();
		
		if (instancia01.equals(instancia02)) {
			System.out.println("AS DUAS INSTÁNCIAS SÃO IGUAIS. XD");
		} else {
			System.out.println("AS DUAS INSTÁNCIAS SÃO DIFERENTES.");
		}
		
		
	}
}


