package com.senac.designpatterns.state.estados;

import com.senac.designpatterns.state.interfaces.EstadoPacote;
import com.senac.designpatterns.state.model.Pacote;

public class EstadoEntregue implements EstadoPacote {
    @Override
    public void proximo(Pacote pacote) {
        System.out.println("O pacote já foi entregue");
    }

    @Override
    public void anterior(Pacote pacote) {
        pacote.setEstado(new EstadoEnviado());
    }

    @Override
    public String getEstado() {
        return "Pacote entregue enviado ao destinatário";
    }
}
