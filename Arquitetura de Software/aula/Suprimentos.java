package alan.aula;

public class Suprimentos extends Pessoa {
    // Construtor
    public Suprimentos(String identificacaoUnica, String nome, String cpf, double salario, String dataNascimento, String telefone, String email, String endereco, boolean pcd, String escolaridade) {
        super(identificacaoUnica, nome, "Suprimentos", cpf, salario, dataNascimento, telefone, email, endereco, pcd, escolaridade, "Suprimentos");
    }

    // Métodos específicos
    public void consultaSuprimentos(Estoque estoqueSuprimentos) {
        System.out.println("Consultando suprimentos...");
        estoqueSuprimentos.listarProdutos();
    }

    public void gerirEstoque() {
        System.out.println("Gerindo estoque...");
    }

    @Override
    public void executarFuncao() {
        gerirEstoque();
    }
}
