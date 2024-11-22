package gof.command2;

public class LimparCozinha implements Command {
    private Cozinheiro cozinheiro;

    public LimparCozinha(Cozinheiro cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    @Override
    public void executar() {
        cozinheiro.limparCozinha();
    }
}