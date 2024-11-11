package br.com.senac.bridgeQ2.conversor;
import br.com.senac.bridgeQ2.empregados.*;
import br.com.senac.bridgeQ2.formatos.*;

public class Main {
    public static void main(String[] args) {
        Empregado gerente = new GerenteDeProjetos("Carlos", 40, 7500.00);
        Empregado analista = new Analista("Ana", 30, 5000.00);
        Empregado secretaria = new Secretaria("Luiza", 25, 3000.00);

        Formato formatoCSV = new FormatoCSV();
        Formato formatoJSON = new FormatoJSON();

        ConversorEmpregado conversorCSVGerente = new ConversorEmpregado(gerente, formatoCSV);
        ConversorEmpregado conversorCSVAnalista = new ConversorEmpregado(analista, formatoCSV);
        ConversorEmpregado conversorCSVSecretaria = new ConversorEmpregado(secretaria, formatoCSV);

        System.out.println("Formato CSV:");
        conversorCSVGerente.exibirDados();
        conversorCSVAnalista.exibirDados();
        conversorCSVSecretaria.exibirDados();

        ConversorEmpregado conversorJSONGerente = new ConversorEmpregado(gerente, formatoJSON);
        ConversorEmpregado conversorJSONAnalista = new ConversorEmpregado(analista, formatoJSON);
        ConversorEmpregado conversorJSONSecretaria = new ConversorEmpregado(secretaria, formatoJSON);

        System.out.println("\nFormato JSON:");
        conversorJSONGerente.exibirDados();
        conversorJSONAnalista.exibirDados();
        conversorJSONSecretaria.exibirDados();
    }
}