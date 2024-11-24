package com.senac.designpatterns.statefacade.services;

public class ProcessadorPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento: R$" + valor);
    }
}
