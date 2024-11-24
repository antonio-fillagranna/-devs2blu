package com.senac.designpatterns.statefacade.services;

import com.senac.designpatterns.statefacade.model.Pedido;

public class Cozinha {
    public void prepararPedido(Pedido pedido) {
        System.out.println("Cozinha preparando pedido: " + pedido.getItens());
    }
}
