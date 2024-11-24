package com.senac.designpatterns.statefacade.interfaces.estados;

import com.senac.designpatterns.statefacade.model.Pedido;
import com.senac.designpatterns.statefacade.interfaces.EstadoPedido;

public class EstadoEntregue implements EstadoPedido {
    @Override
    public void proximoEstado(Pedido pedido) {
        // Estado final, não faz nada
    }

    @Override
    public String getDescricaoStatus() {
        return "Entregue";
    }
}
