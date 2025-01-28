package alan.aula;

public class Financeiro extends Pessoa {
    // Construtor
    public Financeiro(String identificacaoUnica, String nome, String cpf, double salario, String dataNascimento, String telefone, String email, String endereco, boolean pcd, String escolaridade) {
        super(identificacaoUnica, nome, "Financeiro", cpf, salario, dataNascimento, telefone, email, endereco, pcd, escolaridade, "Financeiro");
    }

    // Métodos específicos
    public void consultaSalario() {
        System.out.println("Consultando salário...");
    }

    public void pagarSalarios() {
        System.out.println("Pagando salários...");

        Pessoa pessoa1 = SistemaLogin.login("1"); // Alice
        Pessoa pessoa2 = SistemaLogin.login("3"); // Carlos
        Pessoa pessoa3 = SistemaLogin.login("5"); // Elena - Comercial com comissão

        if (pessoa1 != null) {
            System.out.println("Pagando salário de " + pessoa1.getNome() + ": $" + pessoa1.getSalario());
        }
        if (pessoa2 != null) {
            System.out.println("Pagando salário de " + pessoa2.getNome() + ": $" + pessoa2.getSalario());
        }
        if (pessoa3 != null) {
            Comercial comercial = (Comercial) pessoa3;
            double salarioComComissao = comercial.getSalario() + comercial.getComissao();
            System.out.println("Pagando salário de " + comercial.getNome() + " com comissão: $" + salarioComComissao);
        }
    }

    @Override
    public void executarFuncao() {
        consultaSalario();
        pagarSalarios();
    }
}
