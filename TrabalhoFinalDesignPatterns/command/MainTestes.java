package gof.command;

public class MainTestes {
    public static void main(String[] args) {
    	
        Acao acaoABC = new Acao("ABC", 1000);

        ComprarAcao ordemDeCompra = new ComprarAcao(acaoABC);
        VenderAcao ordemDeVenda = new VenderAcao(acaoABC);

        Corretor corretor = new Corretor();
        corretor.receberOrdem(ordemDeCompra);
        corretor.receberOrdem(ordemDeVenda);

        corretor.executarOrdens();
        
    }
}