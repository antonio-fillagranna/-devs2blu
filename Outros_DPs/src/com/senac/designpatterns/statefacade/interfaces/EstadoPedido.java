package com.senac.designpatterns.statefacade.interfaces;

import com.senac.designpatterns.statefacade.model.Pedido;

public interface EstadoPedido {
    void proximoEstado(Pedido pedido);
    String getDescricaoStatus();
}
