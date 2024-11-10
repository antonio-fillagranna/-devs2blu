package com.senac.designpatterns.abstractfactory.Q2.model;

public class HTMLChart implements Chart{
    @Override
    public void gerarChart() {
        System.out.println("Gerando gráfico em HTML.");

    }
}