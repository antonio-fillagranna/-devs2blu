package alan.aula;

public class GestaoEstrat extends Pessoa {
    // Construtor
    public GestaoEstrat(String identificacaoUnica, String nome, String cpf, double salario, String dataNascimento, String telefone, String email, String endereco, boolean pcd, String escolaridade) {
        super(identificacaoUnica, nome, "GestaoEstrat", cpf, salario, dataNascimento, telefone, email, endereco, pcd, escolaridade, "GestaoEstrat");
    }

    // Métodos específicos
    public void consultaProjetos() {
        System.out.println("Consultando projetos...");
    }

    public void consultaKPI() {
        System.out.println("Consultando KPIs...");
    }

    @Override
    public void executarFuncao() {
        consultaProjetos();
        consultaKPI();
    }
}
