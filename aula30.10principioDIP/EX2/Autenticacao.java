package EX2;

class Autenticacao {
    private EstrategiaAutenticacao estrategia;

    public Autenticacao(EstrategiaAutenticacao estrategia) {
        this.estrategia = estrategia;
    }

    public boolean login(String identificador, String senha) {
        return estrategia.autenticar(identificador, senha);
    }
}