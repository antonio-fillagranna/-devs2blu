package aluguelfesta;

import java.util.Arrays;

public class TesteAluguel {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rafaela", "99999-9999", "Rua das Flores, 123");

        Tema tema = new Tema(Arrays.asList("Castelo", "Boneca da Cinderela", "Bruxa"), 500.0, "Azul");

        Aluguel aluguel = new Aluguel(cliente, tema, "15/10/2024", "14:00", "18:00", 500.0);

        double valorComDesconto = aluguel.calcularValorComDesconto(10);
    
        System.out.println("Valor original: " + aluguel.getValorCobrado());
    
        System.out.println("Valor com desconto: " + valorComDesconto);
    }
}
