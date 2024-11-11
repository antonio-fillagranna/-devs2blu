package br.com.senac.bridge.formas;

import br.com.senac.bridge.cores.Cor;
import br.com.senac.bridge.estilo.*;

public class Circulo extends Forma {
    public Circulo(Cor cor, Estilo estilo) {
        super(cor, estilo);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Círculo de estilo " + estilo.aplicarEstilo());
    }
}