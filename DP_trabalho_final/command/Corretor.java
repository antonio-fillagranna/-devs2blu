package gof.command;

import java.util.ArrayList;
import java.util.List;

public class Corretor {
    private List<Command> listaDeComandos = new ArrayList<>();

    public void receberOrdem(Command comando) {
        listaDeComandos.add(comando);
    }

    public void executarOrdens() {
        for (Command comando : listaDeComandos) {
            comando.executar();
        }
        listaDeComandos.clear();
    }
}