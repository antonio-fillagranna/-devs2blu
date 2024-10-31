package EX2;

class AutenticacaoPorEmail implements EstrategiaAutenticacao {
    @Override
    public boolean autenticar(String email, String senha) {
        System.out.println("Autenticando por email...");
        // Simulação de autenticação
        return email.equals("usuario@example.com") && senha.equals("senha123");
    }
}