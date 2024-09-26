import java.util.Scanner;

public class l6array4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        String[] clientes = new String[5];
        int[] locacoes = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do cliente " + (i+1) + ": ");
            clientes[i] = scan.nextLine();
            System.out.print("Digite a quantidade de DVDs locados por " + clientes[i] + ": ");
            locacoes[i] = scan.nextInt();
            scan.nextLine();
        }

        System.out.println("\nLocações grátis por cliente:");
        for (int i = 0; i < 5; i++) {
            int locacoesGratis = locacoes[i] / 10;
            System.out.println(clientes[i] + ": " + locacoesGratis + " locações grátis");
        }
        scan.close();
    }
}