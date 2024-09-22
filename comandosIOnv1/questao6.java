import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner folhas = new Scanner(System.in);
	    System.out.println("Entre numero de folhas:");
	    double pag = folhas.nextFloat();
        System.out.println("Valor do xerox: " + pag*2*0.08);
    }
}
