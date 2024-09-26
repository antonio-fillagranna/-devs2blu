import java.util.Scanner;

public class l6matriz1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número de pessoas entrevistadas: ");
        int numPessoas = scan.nextInt();
        scan.nextLine();
        String[][] filhos = new String[numPessoas][];

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Entrevistado " + (i + 1));
            System.out.print("Digite a quantidade de filhos: ");
            int numFilhos = scan.nextInt();
            scan.nextLine();
            filhos[i] = new String[numFilhos];
            for (int j = 0; j < numFilhos; j++) {
                System.out.print("Digite o nome do filho " + (j + 1) + ": ");
                filhos[i][j] = scan.nextLine();
            }
        }
        System.out.println("\nResultado da Pesquisa:");
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Entrevistado " + (i + 1) + " tem " + filhos[i].length + " filhos.");
            for (int j = 0; j < filhos[i].length; j++) {
                System.out.println("Filho " + (j + 1) + ": " + filhos[i][j]);
            }
        }
        scan.close();
    }
}