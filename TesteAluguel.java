package POO;
import java.util.Arrays;

public class TesteAluguel {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("Rafaela", "99999-9999", "Rua das Flores, 123");

        // Criando um tema
        Tema tema = new Tema(Arrays.asList("Castelo", "Boneca da Cinderela", "Bruxa"), 500.0, "Azul");

        // Criando um aluguel
        Aluguel aluguel = new Aluguel(cliente, tema, "15/10/2024", "14:00", "18:00", 500.0);

        // Aplicando um desconto
        double valorComDesconto = aluguel.calcularValorComDesconto(10); // 10% de desconto

        // Exibindo o valor com desconto
        System.out.println("Valor original: " + aluguel.ValorCobrado());
        System.out.println("Valor com desconto: " + valorComDesconto);
    }
}