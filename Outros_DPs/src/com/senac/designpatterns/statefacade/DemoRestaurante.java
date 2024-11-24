package com.senac.designpatterns.statefacade;

import com.senac.designpatterns.statefacade.model.Pedido;
import com.senac.designpatterns.statefacade.services.FachadaRestaurante;

public class DemoRestaurante {
    public static void main(String[] args) {
        // Criando a Fachada
        FachadaRestaurante fachadaRestaurante = new FachadaRestaurante();

        // Criando um novo pedido
        Pedido pedido = new Pedido(1, "1x Hambúrguer, 1x Batata Frita");

        // Usando a Fachada para processar o pedido
        fachadaRestaurante.processarPedido(pedido, 50.00);
    }
}
