package gof.command2;

public class MainTestes {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        Command limparCozinha = new LimparCozinha(cozinheiro);
        Command prepararIngredientes = new PrepararIngredientes(cozinheiro);
        Command fazerPratoSalgado = new FazerPratoSalgado(cozinheiro);
        Command fazerBolo = new FazerBolo(cozinheiro);

        ChefDeCozinha chef = new ChefDeCozinha();
        chef.receberOrdem(limparCozinha);
        chef.receberOrdem(prepararIngredientes);
        chef.receberOrdem(fazerPratoSalgado);
        chef.receberOrdem(fazerBolo);

        chef.executarOrdens();
    }
}