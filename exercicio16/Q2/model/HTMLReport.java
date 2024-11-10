package com.senac.designpatterns.abstractfactory.Q2.model;

public class HTMLReport implements Report{
    @Override
    public void gerarReport() {
        System.out.println("Gerando relatório em HTML.");
    }
}