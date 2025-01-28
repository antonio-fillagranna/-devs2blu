package alan.aula;

public class RH extends Pessoa {
    // Construtor
    public RH(String identificacaoUnica, String nome, String cpf, double salario, String dataNascimento, String telefone, String email, String endereco, boolean pcd, String escolaridade) {
        super(identificacaoUnica, nome, "RH", cpf, salario, dataNascimento, telefone, email, endereco, pcd, escolaridade, "RH");
    }

    // Métodos específicos
    public void consultaExames() {
        System.out.println("Consultando exames...");
    }

    public void validarCPF() {
        System.out.println("Validando CPF...");
    }

    public void agendarExames() {
        System.out.println("Agendando exames...");
    }

    public void treinarPessoas() {
        System.out.println("Consultando pessoas cadastradas...");
    }

    public void listarPessoas() {
        SistemaLogin.listarPessoasCadastradas();
    }

    @Override
    public void executarFuncao() {
        consultaExames();
        validarCPF();
        agendarExames();
        treinarPessoas();
        listarPessoas();
    }
}
