import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scan.next().toLowerCase().charAt(0);

        if (Character.isLetter(letra)) {
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("A letra é uma vogal.");
                    break;
                default:
                    System.out.println("A letra é uma consoante.");
                    break;
            }
        } else {
            System.out.println("Entrada inválida. Digite apenas uma letra.");
        }

        scan.close();
    }
}