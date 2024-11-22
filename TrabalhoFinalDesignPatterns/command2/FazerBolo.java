package gof.command2;

public class FazerBolo implements Command {
    private Cozinheiro cozinheiro;

    public FazerBolo(Cozinheiro cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    @Override
    public void executar() {
        cozinheiro.fazerBolo();
    }
}