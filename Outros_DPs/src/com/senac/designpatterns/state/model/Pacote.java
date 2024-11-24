package com.senac.designpatterns.state.model;

import com.senac.designpatterns.state.interfaces.EstadoPacote;
import com.senac.designpatterns.state.estados.EstadoPedido;

public class Pacote {
    private EstadoPacote estado;

    public Pacote() {
        estado = new EstadoPedido();
    }

    public void proximaEstado() {
        estado.proximo(this);
    }

    public void estadoAnterior() {
        estado.anterior(this);
    }

    public String getEstado() {
        return estado.getEstado();
    }

    public void setEstado(EstadoPacote estado) {
        this.estado = estado;
    }
}
