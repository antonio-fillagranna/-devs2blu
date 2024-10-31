package EX1;

class ArquivoTexto implements MecanismoArmazenamento {
    @Override
    public void salvar(String dados) {
        System.out.println("Salvando '" + dados + "' em um arquivo de texto.");
    }
}