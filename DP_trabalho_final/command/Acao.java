package gof.command;

public class Acao {
    private String nome;
    private int quantidade;

    public Acao(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void comprar() {
        System.out.println("Ação [ Nome: " + nome + ", Quantidade: " + quantidade + " ] comprada");
    }

    public void vender() {
        System.out.println("Ação [ Nome: " + nome + ", Quantidade: " + quantidade + " ] vendida");
    }
}
