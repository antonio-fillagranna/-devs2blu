package br.com.senac.bridgeQ2.conversor;
import br.com.senac.bridgeQ2.empregados.*;
import br.com.senac.bridgeQ2.formatos.*;

public class ConversorEmpregado {
    private Empregado empregado;
    private Formato formato;

    public ConversorEmpregado(Empregado empregado, Formato formato) {
        this.empregado = empregado;
        this.formato = formato;
    }

    public void exibirDados() {
        System.out.println(formato.formatarDados(empregado));
    }
}