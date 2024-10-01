package jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {
    private char[][] tabuleiro;
    private int jogada;
    private boolean ganhou;

    public JogoDaVelha() {
        tabuleiro = new char[3][3];
        jogada = 1;
        ganhou = false;
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == 0) {
                    System.out.print("   | ");
                } else {
                    System.out.print(" " + tabuleiro[i][j] + " | ");
                }
            }
            System.out.println();
        }
    }
    
     public void realizarJogada(char sinal) {
        Scanner scan = new Scanner(System.in);
        int linha = 0, coluna = 0;
        boolean linhaValida = false, colunaValida = false;

        while (!linhaValida) {
            System.out.println("Escolha a linha (1-3):");
            linha = scan.nextInt();
            if (linha >= 1 && linha <= 3) {
                linhaValida = true;
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }
        while (!colunaValida) {
            System.out.println("Escolha a coluna (1-3):");
            coluna = scan.nextInt();
            if (coluna >= 1 && coluna <= 3) {
                colunaValida = true;
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }
        
        linha--;
        coluna--;

        if (tabuleiro[linha][coluna] == 0) {
            tabuleiro[linha][coluna] = sinal;
            jogada++;
        } else {
            System.out.println("Posição já ocupada. Tente novamente.");
        }
    }
      public boolean verificarGanhador(char sinal) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == sinal && tabuleiro[i][1] == sinal && tabuleiro[i][2] == sinal) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == sinal && tabuleiro[1][i] == sinal && tabuleiro[2][i] == sinal) {
                return true;
            }
        }
        if (tabuleiro[0][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][2] == sinal) {
            return true;
        }
        if (tabuleiro[0][2] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][0] == sinal) {
            return true;
        }
        return false;
    }
      public void iniciarJogo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        while (!ganhou) {
            char sinal = (jogada % 2 == 1) ? 'X' : 'O';
            System.out.println("Vez do Jogador " + (sinal == 'X' ? "1" : "2") + ". Escolha linha e coluna (1-3)");
            realizarJogada(sinal);
            imprimirTabuleiro();

            if (verificarGanhador(sinal)) {
                ganhou = true;
                System.out.println("Parabéns, jogador " + (sinal == 'X' ? "1" : "2") + " ganhou!");
            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou. Empate!");
            }
        }
    }
}
