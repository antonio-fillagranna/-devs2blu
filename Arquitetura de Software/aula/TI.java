package alan.aula;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class TI extends Pessoa {
    private Map<String, String> chamados = new HashMap<>();

    // Construtor
    public TI(String identificacaoUnica, String nome, String cpf, double salario, String dataNascimento, String telefone, String email, String endereco, boolean pcd, String escolaridade) {
        super(identificacaoUnica, nome, "TI", cpf, salario, dataNascimento, telefone, email, endereco, pcd, escolaridade, "TI");
    }

    // Método para adicionar chamado
    public void adicionarChamado(String cpf, String status) {
        chamados.put(cpf, status);
    }

    // Métodos específicos
    public void consultaChamados() {
        System.out.println("Consultando chamados...");
        for (Map.Entry<String, String> entry : chamados.entrySet()) {
            Pessoa pessoa = SistemaLogin.login(entry.getKey());
            if (pessoa != null) {
                LocalDate dataAtual = LocalDate.now();
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Identificação: " + pessoa.getIdentificacaoUnica());
                System.out.println("Status: " + entry.getValue());
                System.out.println("Setor: " + pessoa.retornaSetor());
                System.out.println("Data Atual: " + dataAtual);
                System.out.println("Email: " + pessoa.getEmail());
                System.out.println("---------------------------");
            } else {
                System.out.println("Chamado para CPF: " + entry.getKey() + ", Status: " + entry.getValue());
            }
        }
    }

    public void atualizarSistemas() {
        System.out.println("Atualizando sistemas...");
    }

    @Override
    public void executarFuncao() {
        consultaChamados();
        atualizarSistemas();
    }
}
