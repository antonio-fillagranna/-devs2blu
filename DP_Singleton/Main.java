public class Main {
    public static void main(String[] args) {
        // Tentando obter a instância do Singleton
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.executeQuery("SELECT * FROM usuarios");

        // Tentando obter a instância novamente
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.executeQuery("INSERT INTO usuarios (nome) VALUES ('João')");

        // Verificando se as duas instâncias são iguais
        System.out.println("As conexões são as mesmas? " + (connection1 == connection2));
    }
}
