package EX1;

public class Main {
    public static void main(String[] args) {

        MecanismoArmazenamento bancoDados = new BancoDados();
        Armazenamento armazenamentoBD = new Armazenamento(bancoDados);
        armazenamentoBD.salvarDados("Dado 1");


        MecanismoArmazenamento arquivoTexto = new ArquivoTexto();
        Armazenamento armazenamentoArquivo = new Armazenamento(arquivoTexto);
        armazenamentoArquivo.salvarDados("Dado 2");
    }
}