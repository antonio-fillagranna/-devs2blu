public class DatabaseConnection {
    // Instância única (Singleton)
    private static DatabaseConnection instance;

    // Construtor privado para evitar criação externa de instâncias
    private DatabaseConnection() {
        System.out.println("Conexão criada!");
    }

    // Método público para obter a instância única
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) { // Garantir segurança em ambientes multithread
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    // Método para simular execução de uma consulta ao banco de dados
    public void executeQuery(String query) {
        System.out.println("Executando: " + query);
    }
}
