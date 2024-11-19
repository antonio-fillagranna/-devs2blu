package gof.command;

public class ComprarAcao implements Command {
    private Acao acao;

    public ComprarAcao(Acao acao) {
        this.acao = acao;
    }

    @Override
    public void executar() {
        acao.comprar();
    }
}