package com.senac.designpatterns.statefacade.interfaces.estados;

import com.senac.designpatterns.statefacade.model.Pedido;
import com.senac.designpatterns.statefacade.interfaces.EstadoPedido;

public class EstadoNovo implements EstadoPedido {
    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstado(new EstadoPreparando());
    }

    @Override
    public String getDescricaoStatus() {
        return "Novo pedido";
    }
}
