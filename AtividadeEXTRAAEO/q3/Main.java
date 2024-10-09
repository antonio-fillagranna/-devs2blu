package q3;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("João Silva", 150.0);
        ServicoEnvio servicoEnvio = new ServicoEnvio();
        NotaFiscal notaFiscal = new NotaFiscal();
        servicoEnvio.enviar(pedido, "Rua das Flores, 123");
        notaFiscal.gerar(pedido);
    }
}
