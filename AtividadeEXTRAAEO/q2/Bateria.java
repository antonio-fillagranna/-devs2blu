package q2;

public class Bateria {
    private int carga;

    public Bateria(int cargaInicial) {
        this.carga = cargaInicial;
    }

    public int getCarga() {
        return carga;
    }

    public void consumirCarga(int quantidade) {
        if (carga - quantidade >= 0) {
            carga -= quantidade;
        } else {
            carga = 0;
        }
    }

    public boolean temCarga() {
        return carga > 0;
    }
}
