package alan.aula;

public class Faturamento extends Pessoa {
    // Construtor
    public Faturamento(String identificacaoUnica, String nome, String cpf, double salario, String dataNascimento, String telefone, String email, String endereco, boolean pcd, String escolaridade) {
        super(identificacaoUnica, nome, "Faturamento", cpf, salario, dataNascimento, telefone, email, endereco, pcd, escolaridade, "Faturamento");
    }

    // Métodos específicos
    public void consultaFaturas() {
        System.out.println("Consultando faturas...");
    }

    public void emitirNotasFiscais() {
        System.out.println("Emitindo notas fiscais...");
    }

    public void gerarFatura() {
        System.out.println("Gerando fatura...");
    }

    @Override
    public void executarFuncao() {
        consultaFaturas();
        emitirNotasFiscais();
        gerarFatura();
    }
}
