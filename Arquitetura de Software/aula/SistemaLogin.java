package alan.aula;

import java.util.HashMap;
import java.util.Map;

public class SistemaLogin {
    private static Map<String, Pessoa> usuarios = new HashMap<>();

    // Método para adicionar usuários
    public static void adicionarUsuario(Pessoa pessoa) {
        usuarios.put(pessoa.getCpf(), pessoa);
    }

    // Método para fazer login
    public static Pessoa login(String cpf) {
        return usuarios.get(cpf);
    }

    // Método para listar todas as pessoas cadastradas (usado pelo RH)
    public static void listarPessoasCadastradas() {
        for (Pessoa pessoa : usuarios.values()) {
            System.out.println("Identificação: " + pessoa.getIdentificacaoUnica());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Cargo: " + pessoa.getCargo());
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("Salário: " + pessoa.getSalario());
            System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
            System.out.println("Telefone: " + pessoa.getTelefone());
            System.out.println("Email: " + pessoa.getEmail());
            System.out.println("Endereço: " + pessoa.getEndereco());
            System.out.println("PCD: " + (pessoa.isPcd() ? "Sim" : "Não"));
            System.out.println("Escolaridade: " + pessoa.getEscolaridade());
            System.out.println("Setor: " + pessoa.getSetor());
            System.out.println("---------------------------");
        }
    }
}
