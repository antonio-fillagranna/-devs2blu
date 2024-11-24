package com.senac.designpatterns.state.estados;

import com.senac.designpatterns.state.interfaces.EstadoPacote;
import com.senac.designpatterns.state.model.Pacote;

public class EstadoPedido implements EstadoPacote {
    @Override
    public void proximo(Pacote pacote) {
        pacote.setEstado(new EstadoEnviado());
    }

    @Override
    public void anterior(Pacote pacote) {
        System.out.println("O pacote já está em seu estado inicial");
    }

    @Override
    public String getEstado() {
        return "Pedido realizado , aguardando envio";
    }
}
