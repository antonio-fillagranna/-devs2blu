package com.senac.designpatterns.statefacade.interfaces.estados;

import com.senac.designpatterns.statefacade.model.Pedido;
import com.senac.designpatterns.statefacade.interfaces.EstadoPedido;

public class EstadoPronto implements EstadoPedido {
    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstado(new EstadoEntregue());
    }

    @Override
    public String getDescricaoStatus() {
        return "Pronto para entrega";
    }
}
