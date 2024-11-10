package com.senac.designpatterns.abstractfactory.Q1.factory.impl;

import com.senac.designpatterns.abstractfactory.Q1.factory.TemaFactory;
import com.senac.designpatterns.abstractfactory.Q1.model.Label;
import com.senac.designpatterns.abstractfactory.Q1.model.Textbox;
import com.senac.designpatterns.abstractfactory.Q1.model.impl.LabelClaro;
import com.senac.designpatterns.abstractfactory.Q1.model.impl.TextboxClaro;

public class TemaClaroFactory implements TemaFactory {
    public Textbox criarTextbox() {
        return new TextboxClaro();
    }

    public Label criarLabel() {
        return new LabelClaro();
    }
}