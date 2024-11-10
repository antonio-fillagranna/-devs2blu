package com.senac.designpatterns.abstractfactory.Q2.model;

public class PDFChart implements Chart {
    @Override
    public void gerarChart() {
        System.out.println("Gerando gráfico em PDF.");
    }
}