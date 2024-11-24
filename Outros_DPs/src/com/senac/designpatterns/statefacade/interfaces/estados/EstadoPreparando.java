package com.senac.designpatterns.statefacade.interfaces.estados;

import com.senac.designpatterns.statefacade.model.Pedido;
import com.senac.designpatterns.statefacade.interfaces.EstadoPedido;

public class EstadoPreparando implements EstadoPedido {
    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstado(new EstadoPronto());
    }

    @Override
    public String getDescricaoStatus() {
        return "Preparando";
    }
}
