package br.com.senac.bridge.formas;

import br.com.senac.bridge.cores.*;
import br.com.senac.bridge.estilo.*;

public class Quadrado extends Forma {
    public Quadrado(Cor cor, Estilo estilo) {
        super(cor, estilo);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Quadrado de estilo " + estilo.aplicarEstilo());
    }
}
