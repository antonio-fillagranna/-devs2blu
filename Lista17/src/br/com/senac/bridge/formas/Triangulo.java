package br.com.senac.bridge.formas;

import br.com.senac.bridge.cores.*;
import br.com.senac.bridge.estilo.*;

public class Triangulo extends Forma {
    public Triangulo(Cor cor, Estilo estilo) {
        super(cor, estilo);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Triângulo de estilo " + estilo.aplicarEstilo());
    }
}