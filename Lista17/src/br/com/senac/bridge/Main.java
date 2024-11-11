package br.com.senac.bridge;

import br.com.senac.bridge.cores.*;
import br.com.senac.bridge.formas.*;
import br.com.senac.bridge.estilo.*;


public class Main {
    public static void main(String[] args) {

        Cor vermelho = new Vermelho();
        Cor azul = new Azul();
        Estilo solido = new Solido();
        Estilo tracejado = new Tracejado();

        Forma circuloVermelhoSolido = new Circulo(vermelho, solido);
        Forma quadradoVermelhoTracejado = new Quadrado(vermelho, tracejado);
        Forma trianguloVermelhoSolido = new Triangulo(vermelho, solido);
        
        Forma circuloAzulSolido = new Circulo(azul, solido);
        Forma quadradoAzulTracejado = new Quadrado(azul, tracejado);
        Forma trianguloAzulSolido = new Triangulo(azul, solido);

        circuloVermelhoSolido.desenhar();
        quadradoVermelhoTracejado.desenhar();
        trianguloVermelhoSolido.desenhar();
        
        circuloAzulSolido.desenhar();
        quadradoAzulTracejado.desenhar();
        trianguloAzulSolido.desenhar();
    }
}