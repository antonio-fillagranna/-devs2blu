package gof.command;

public class VenderAcao implements Command {
    private Acao acao;

    public VenderAcao(Acao acao) {
        this.acao = acao;
    }

    @Override
    public void executar() {
    	acao.vender();
    }
}