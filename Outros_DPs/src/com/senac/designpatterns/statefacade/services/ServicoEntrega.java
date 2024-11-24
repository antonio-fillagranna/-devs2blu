package com.senac.designpatterns.statefacade.services;

import com.senac.designpatterns.statefacade.model.Pedido;

public class ServicoEntrega {
    public void entregarPedido(Pedido pedido) {
        System.out.println("Entregando pedido: " + pedido.getNumeroPedido());
    }
}
