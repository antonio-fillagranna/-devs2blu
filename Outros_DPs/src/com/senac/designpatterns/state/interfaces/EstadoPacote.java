package com.senac.designpatterns.state.interfaces;

import com.senac.designpatterns.state.model.Pacote;

public interface EstadoPacote {
    void proximo(Pacote pacote);

    void anterior(Pacote pacote);

    String getEstado();
}
