package br.com.senac.bridge.formas;

import br.com.senac.bridge.cores.*;
import br.com.senac.bridge.estilo.*;


public abstract class Forma {
 protected Cor cor;
 protected Estilo estilo;

 public Forma(Cor cor, Estilo estilo) {
     this.cor = cor;
     this.estilo = estilo;
 }

 public abstract void desenhar();
}