package EX1;

class BancoDados implements MecanismoArmazenamento {
    @Override
    public void salvar(String dados) {
        System.out.println("Salvando '" + dados + "' no Banco de Dados.");
    }
}