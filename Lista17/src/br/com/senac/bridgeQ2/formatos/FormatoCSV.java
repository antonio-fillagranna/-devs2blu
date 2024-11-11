package br.com.senac.bridgeQ2.formatos;
import br.com.senac.bridgeQ2.empregados.*;

public class FormatoCSV implements Formato {
    @Override
    public String formatarDados(Empregado empregado) {
        return empregado.getNome() + "," + empregado.getIdade() + "," + empregado.getSalario();
    }
}