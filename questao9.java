import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Entre valor padrão: ");
        double desc = valor.nextFloat();
        System.out.println("Valor promocional: " + desc*0.91);
    }
}
