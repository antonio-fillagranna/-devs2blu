package gof.singleton;

public class Database {

	// ESSA VÁRIAVEL OBRIGATÓRIA
	// VAI SER RETORNADA AO INVES USAR O NEW
	private static Database instancia;

	// É OBRIGATÓRIO O CONSTRUTOR SER PRIVADO
	// MOTIVO PARA NÃO SER POSSÍVEL CRIAR A NEW DESSA CLASSE
	// SE TIVER PUBLIC FERE O PRINCIPIO DE SINGLETON
	// NO DIAGRAMA É REPRESENTADO POR MENOS OU PRIVADO
	private Database() { 
		
	}

	// ESSE É O METODO PUBLICO 
	// QUE VAI CRIAR UMA INSTANCIA OU RETORNAR UMA JÁ EXISTENTE
	public static Database getInstancia() {
		
		// AQUI ESTÁ O TESOURO XD
		// NA PRIMEIRA VEZ PASSA AQUI XD
		// E CRIA O NEW
		if (instancia == null) {
			instancia = new Database();
		}
		
		// SEMPRE VAI SER RETORNADO A INSTANCIA		
		return instancia;

	}

}
