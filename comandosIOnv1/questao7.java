import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner meuNome = new Scanner(System.in);
        System.out.println("Entre seu nome: ");
        String nome = meuNome.nextLine();
        System.out.println("Nome: " + nome);

        Scanner minhaIdade = new Scanner(System.in);
        System.out.println("Entre sua idade: ");
        double idade = minhaIdade.nextFloat();
        System.out.println("Idade: " + idade);

        double diasVividos = idade*365;
        System.out.println("Dias vividos ~=" + diasVividos);

    }
}
