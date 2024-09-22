import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = scan.nextInt();
        boolean bissexto;

        if (ano % 400 == 0) {
            bissexto = true;
        } else if (ano % 4 == 0 && ano % 100 != 0) {
            bissexto = true;
        } else {
            bissexto = false;
        }
        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        scan.close();
    }
}