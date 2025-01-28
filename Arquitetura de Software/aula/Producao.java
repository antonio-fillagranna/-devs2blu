package alan.aula;

public class Producao extends Pessoa {
    // Construtor
    public Producao(String identificacaoUnica, String nome, String cpf, double salario, String dataNascimento, String telefone, String email, String endereco, boolean pcd, String escolaridade) {
        super(identificacaoUnica, nome, "Producao", cpf, salario, dataNascimento, telefone, email, endereco, pcd, escolaridade, "Producao");
    }

    // Métodos específicos
    public void controlarProducao() {
        System.out.println("Controlando produção...");
    }

    public void controlarQualidade() {
        System.out.println("Controlando qualidade...");
    }

    public void fabricarProduto(Produto produto) {
        System.out.println("Fabricando produto: " + produto.getNome() + " - Quantidade: " + produto.getQuantidade());
    }

    @Override
    public void executarFuncao() {
        controlarQualidade();
     
    }
}
