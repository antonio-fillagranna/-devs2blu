import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Entre salário-base: ");
        double desc = valor.nextFloat();
        System.out.println("Salário líquido (+5% -7% = -2%): " + desc*0.98);
    }
}
