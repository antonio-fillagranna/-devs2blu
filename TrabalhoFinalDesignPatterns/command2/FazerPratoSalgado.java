package gof.command2;

public class FazerPratoSalgado implements Command {
    private Cozinheiro cozinheiro;

    public FazerPratoSalgado(Cozinheiro cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    @Override
    public void executar() {
        cozinheiro.fazerPratoSalgado();
    }
}