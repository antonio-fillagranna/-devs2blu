package javabasico;
import java.util.Scanner;
public class lista5ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Número a checar = ");
		int num = scan.nextInt();
		boolean primo = verificaPrimo(num);
		for (int i=num; i==2 ; i--) {
			if (num%i == 0) {
				primo = false;
				break;
			}
		}
		if (primo) {
			System.out.println(num + " É primo.");
		}else {
			System.out.println(num + " Não é primo.");
		}
		scan.close();
	}
	
    public static boolean verificaPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
   