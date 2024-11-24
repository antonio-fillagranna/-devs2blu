package com.senac.designpatterns.statefacade.services;

import com.senac.designpatterns.statefacade.model.Pedido;

public class FachadaRestaurante {
    private final Cozinha cozinha;
    private final ServicoEntrega servicoEntrega;
    private final ProcessadorPagamento processadorPagamento;

    public FachadaRestaurante() {
        this.cozinha = new Cozinha();
        this.servicoEntrega = new ServicoEntrega();
        this.processadorPagamento = new ProcessadorPagamento();
    }

    // Método da fachada que simplifica o processo de pedido
    public void processarPedido(Pedido pedido, double valor) {
        System.out.println("=== Iniciando processamento do pedido ===");

        // Processa pagamento
        processadorPagamento.processarPagamento(valor);

        // Prepara o pedido na cozinha
        cozinha.prepararPedido(pedido);
        pedido.proximoEstado(); // Muda para estado "Preparando"

        // Simula preparação completa
        pedido.proximoEstado(); // Muda para estado "Pronto para entrega"

        // Realiza a entrega
        servicoEntrega.entregarPedido(pedido);
        pedido.proximoEstado(); // Muda para estado "Entregue"

        System.out.println("Status final do pedido: " + pedido.getStatus());
        System.out.println("=== Processamento finalizado ===");
    }
}
