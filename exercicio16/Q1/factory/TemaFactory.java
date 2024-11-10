package com.senac.designpatterns.abstractfactory.Q1.factory;

import com.senac.designpatterns.abstractfactory.Q1.model.Label;
import com.senac.designpatterns.abstractfactory.Q1.model.Textbox;

public interface TemaFactory {
    Textbox criarTextbox();
    Label criarLabel();
}