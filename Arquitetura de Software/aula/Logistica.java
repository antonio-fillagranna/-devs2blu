package alan.aula;

public class Logistica extends Pessoa {
    private String cnh;

    // Construtor
    public Logistica(String identificacaoUnica, String nome, String cpf, double salario, String dataNascimento, String telefone, String email, String endereco, boolean pcd, String escolaridade, String cnh) {
        super(identificacaoUnica, nome, "Logistica", cpf, salario, dataNascimento, telefone, email, endereco, pcd, escolaridade, "Logistica");
        this.cnh = cnh;
    }

    // Métodos específicos
    public void consultaEstoque(Estoque estoque) {
        System.out.println("Consultando estoque geral...");
        estoque.listarProdutos();
    }

    public void validarCNH() {
        System.out.println("Validando CNH...");
    }

    @Override
    public void executarFuncao() {
        validarCNH();
    }
}
