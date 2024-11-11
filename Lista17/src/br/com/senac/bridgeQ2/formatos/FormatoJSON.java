package br.com.senac.bridgeQ2.formatos;
import br.com.senac.bridgeQ2.empregados.*;

public class FormatoJSON implements Formato {
    @Override
    public String formatarDados(Empregado empregado) {
        return "{ \"nome\": \"" + empregado.getNome() + "\", " +
               "\"idade\": " + empregado.getIdade() + ", " +
               "\"salario\": " + empregado.getSalario() + " }";
    }
}