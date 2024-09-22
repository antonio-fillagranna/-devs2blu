
import java.util.Scanner;

public class ola1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor da compra = ");
        int valorCompra = scan.nextInt();
        System.out.println("Valor pago = ");
        int valorPagamento = scan.nextInt();
        if (valorPagamento<valorCompra) {
            System.out.println("Pagamento insuficiente");
        }else{
            int troco = valorPagamento - valorCompra;
            int notas100 = troco / 100;
            troco %= 100;

            int notas10 = troco / 10;
            troco %= 10;

            int notas1 = troco;
            System.out.println("Valor da compra R$ " + valorCompra + " valor do troco R$ " + (valorPagamento-valorCompra));
            System.out.println("Notas de 100: " + notas100 + " /notas de 10: " + notas10 + " /notas de 1: "+ notas1);
        }
        scan.close();
    }
}
