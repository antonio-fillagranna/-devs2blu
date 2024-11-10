package com.senac.designpatterns.abstractfactory.Q1;

import com.senac.designpatterns.abstractfactory.Q1.factory.TemaFactory;
import com.senac.designpatterns.abstractfactory.Q1.model.Label;
import com.senac.designpatterns.abstractfactory.Q1.model.Textbox;

public class Cliente {
    private TemaFactory temaFactory;

    public Cliente(TemaFactory temaFactory) {
        this.temaFactory = temaFactory;
    }

    public void renderizarInterface() {
        Textbox textbox = temaFactory.criarTextbox();
        Label label = temaFactory.criarLabel();

        textbox.render();
        label.render();
    }

    public void setTemaFactory(TemaFactory temaFactory) {
        this.temaFactory = temaFactory;
    }
}