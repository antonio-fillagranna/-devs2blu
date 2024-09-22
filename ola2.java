
import java.util.Scanner;

public class ola2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo valor:");
        double n2 = scan.nextDouble();
        System.out.println("Digite a operação a ser realizada (+,-,*,/):");
        char operacao = scan.next().charAt(0);
        double resultado = 0;
        switch (operacao) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1-n2;
                break;
            case '*':
                resultado = n1*n2;
                break;
            case '/':
            if (n2==0){
                System.out.println("erro, impossivel dividir por zero!");
                break;
            }else{
                resultado = n1/n2;
                break;
            }
            default:
                System.out.println("Operação inválida.");
        }
        System.out.println("Resultado = " + resultado);
        if (resultado > 0){
            System.out.println("Resultado eh positivo!");
        }else{
            System.out.println("Resultado eh negativo!");
        }
        if (resultado%2 == 0){
            System.out.println("Resultado eh par!");
        }else{
            System.out.println("Resultado eh ímpar!");
        }

        scan.close();
    }
}
