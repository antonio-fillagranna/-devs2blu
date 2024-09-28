package POO;

// Classe Tema

import java.util.List;

class Tema {
    public List<String> itens;
    public double valorAluguel;
    public String corToalha;

    public Tema(List<String> itens, double valorAluguel, String corToalha) {
        this.itens = itens;
        this.valorAluguel = valorAluguel;
        this.corToalha = corToalha;
    }
}