package com.senac.designpatterns.state.estados;

import com.senac.designpatterns.state.interfaces.EstadoPacote;
import com.senac.designpatterns.state.model.Pacote;

public class EstadoEnviado implements EstadoPacote {
    @Override
    public void proximo(Pacote pacote) {
        pacote.setEstado(new EstadoEntregue());
    }

    @Override
    public void anterior(Pacote pacote) {
        pacote.setEstado(new EstadoPedido());
    }

    @Override
    public String getEstado() {
        return "Pacote Enviado, em trânsito";
    }
}
