package EX2;

public class Main {
    public static void main(String[] args) {
        EstrategiaAutenticacao emailAuth = new AutenticacaoPorEmail();
        Autenticacao autenticacaoEmail = new Autenticacao(emailAuth);
        boolean sucessoEmail = autenticacaoEmail.login("usuario@example.com", "senha123");
        System.out.println("Autenticação por email: " + (sucessoEmail ? "Sucesso" : "Falhou"));

        EstrategiaAutenticacao biometriaAuth = new AutenticacaoPorBiometria();
        Autenticacao autenticacaoBiometria = new Autenticacao(biometriaAuth);
        boolean sucessoBiometria = autenticacaoBiometria.login("usuario_biometria", "biometria_valida");
        System.out.println("Autenticação por biometria: " + (sucessoBiometria ? "Sucesso" : "Falhou"));
    }
}