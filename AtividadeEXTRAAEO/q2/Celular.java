package q2;

public class Celular {
    private Bateria bateria; // Forte acoplamento com a classe Bateria

    public Celular() {
        // O celular cria e gerencia diretamente a bateria
        this.bateria = new Bateria(100); // Inicia com 100% de carga
    }

    public void ligar() {
        if (bateria.temCarga()) {
            System.out.println("Celular ligado.");
            bateria.consumirCarga(20); // Consome 20% de carga ao ligar
        } else {
            System.out.println("Bateria sem carga. Por favor, recarregue.");
        }
    }

    public void mostrarStatusBateria() {
        System.out.println("Carga atual da bateria: " + bateria.getCarga() + "%");
    }
}
