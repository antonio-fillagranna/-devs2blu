import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();
        
        System.out.print("Digite a operação (+, -, * ou /): ");
        char operacao = scan.next().charAt(0);

        int resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida");
                operacaoValida = false;
        }
        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);

            String positivoOuNegativo = (resultado >= 0) ? "positivo" : "negativo";
            System.out.println("O resultado é " + positivoOuNegativo);

            String parOuImpar = (resultado % 2 == 0) ? "par" : "ímpar";
            System.out.println("O resultado é " + parOuImpar);
        }

        scan.close();
    }
}