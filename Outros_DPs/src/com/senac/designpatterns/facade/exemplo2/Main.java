package com.senac.designpatterns.facade.exemplo2;

public class Main {
    public static void main(String[] args) {
        Facade fachada = new Facade();

        System.out.println("Executando operações através da fachada:");
        fachada.operar();
    }
}