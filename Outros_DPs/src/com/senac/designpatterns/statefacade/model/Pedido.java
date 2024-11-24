package com.senac.designpatterns.statefacade.model;

import com.senac.designpatterns.statefacade.interfaces.estados.EstadoNovo;
import com.senac.designpatterns.statefacade.interfaces.EstadoPedido;

public class Pedido {
    private EstadoPedido estado;
    private final String itens;
    private final int numeroPedido;

    public Pedido(int numeroPedido, String itens) {
        this.numeroPedido = numeroPedido;
        this.itens = itens;
        this.estado = new EstadoNovo();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void proximoEstado() {
        estado.proximoEstado(this);
    }

    public String getStatus() {
        return estado.getDescricaoStatus();
    }

    public String getItens() {
        return itens;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }
}
