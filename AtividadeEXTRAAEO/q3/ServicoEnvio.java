package q3;

public class ServicoEnvio {
    public void enviar(Pedido pedido, String endereco) {
        System.out.println("Pedido do cliente " + pedido.getCliente() + " enviado para: " + endereco);
    }
}
