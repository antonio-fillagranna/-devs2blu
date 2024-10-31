package EX2;

class AutenticacaoPorBiometria implements EstrategiaAutenticacao {
    @Override
    public boolean autenticar(String identificador, String biometria) {
        System.out.println("Autenticando por biometria...");
        // Simulação de autenticação
        return identificador.equals("usuario_biometria") && biometria.equals("biometria_valida");
    }
}