import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner horas = new Scanner(System.in);
        System.out.println("Entre quantidade de horas: ");
        double tempo = horas.nextFloat();
        System.out.println("Tempo em horas: " + tempo);
        System.out.println("Tempo em minutos: " + 60*tempo);
        System.out.println("Tempo em segundos: " + 3600*tempo);
    }    
}
