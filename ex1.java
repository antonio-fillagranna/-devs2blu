import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        int valorCompra = scan.nextInt();
        
        System.out.print("Digite o valor do pagamento: ");
        int valorPagamento = scan.nextInt();

        if (valorPagamento < valorCompra) {
            System.out.println("Pagamento Negado");
        } else {
            int troco = valorPagamento - valorCompra;
            int notas100 = troco / 100;
            troco %= 100;

            int notas10 = troco / 10;
            troco %= 10;

            int notas1 = troco;
            System.out.println("Troco = " + (valorPagamento - valorCompra));
            System.out.println(notas100 + " notas de R$ 100, " + notas10 + " notas de R$ 10, " + notas1 + " notas de R$ 1");
        }
        scan.close();
    }
}