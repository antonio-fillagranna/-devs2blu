package ExerciciosPraticaMatrizes;
public class ExemploMatriz {
    public static void main(String[] args) {
        // declara uma matriz com 10 linhas e 10 colunas
        int[][] m = new int[10][10];
 
        System.out.println("Sorteando numeros...");
        // preenche os 100 elementos da matriz com numeros de 1 a 9
        for(int l = 0; l < 10; l++) {
            for(int c = 0; c < 10; c++) {
                // sorteia um numero de 1 a 9 e poe na linha l e na coluna c da matriz
                m[l][c] = (int)(Math.random()*9)+1; 
            }
        }
        System.out.println("Matriz preenchida!");
        // exibe o conteudo da matriz de varias formas
        System.out.println("Conteudo de cada posiao da matriz:");
        for(int l = 0; l < 10; l++) {
            for(int c = 0; c < 10; c++) {
                System.out.println("m["+l+"]["+c+"] = "+m[l][c]);
            }
        }
//        System.out.println("Conteudo da matriz completa:");
        for(int l = 0; l < 10; l++) {
            for(int c = 0; c < 10; c++) {
                System.out.print(m[l][c]+" ");
            }
            System.out.println();
        }
//        System.out.print("Soma dos elementos da 5ª coluna: ");
//        int somaColuna5 = 0;
//       for(int l = 0; l < 10; l++) {
//            somaColuna5 = somaColuna5 + m[l][4];
//        }
//        System.out.println(somaColuna5);
    }
}