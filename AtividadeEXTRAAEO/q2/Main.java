package q2;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();

        celular.mostrarStatusBateria();
        celular.ligar();
        celular.mostrarStatusBateria();

        celular.ligar();
        celular.mostrarStatusBateria();
    }
}
