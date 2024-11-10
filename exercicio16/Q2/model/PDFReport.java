package com.senac.designpatterns.abstractfactory.Q2.model;

public class PDFReport implements Report{
    @Override
    public void gerarReport() {
        System.out.println("Gerando um relatório em PDF.");
    }
}