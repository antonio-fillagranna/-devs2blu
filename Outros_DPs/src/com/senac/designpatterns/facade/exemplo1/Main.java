package com.senac.designpatterns.facade.exemplo1;

public class Main {
    public static void main(String[] args) {
        SubSistemaA subsistemaA = new SubSistemaA();
        SubSistemaB subsistemaB = new SubSistemaB();

        Facade fachada = new FacadeConcreta(subsistemaA, subsistemaB);

        System.out.println("Executando operações através da fachada:");
        fachada.operar();
    }
}