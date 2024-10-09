package q3;

public class NotaFiscal {
    public void gerar(Pedido pedido) {
        System.out.println("Nota fiscal gerada para o cliente " + pedido.getCliente() + " no valor de R$" + pedido.getValorTotal());
    }
}
