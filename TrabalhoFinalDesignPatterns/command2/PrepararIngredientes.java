package gof.command2;

public class PrepararIngredientes implements Command {
    private Cozinheiro cozinheiro;

    public PrepararIngredientes(Cozinheiro cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    @Override
    public void executar() {
        cozinheiro.prepararIngredientes();
    }
}