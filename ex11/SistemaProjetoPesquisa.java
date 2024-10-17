package ex11;
import java.util.*;

public class SistemaProjetoPesquisa {
    private static List<ProjetoPesquisa> projetos = new ArrayList<>();
    private static List<Professor> professores = new ArrayList<>();
    private static List<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Projeto");
            System.out.println("2. Adicionar Integrante ao Projeto");
            System.out.println("3. Mostrar Dados do Projeto");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProjeto(scanner);
                    break;
                case 2:
                    adicionarIntegrante(scanner);
                    break;
                case 3:
                    mostrarDadosProjeto(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarProjeto(Scanner scanner) {
        System.out.println("Código do projeto:");
        String codigo = scanner.nextLine();
        System.out.println("Título do projeto:");
        String titulo = scanner.nextLine();
        System.out.println("Data de início (yyyy-mm-dd):");
        String dataInicio = (scanner.nextLine());
        System.out.println("Data de fim (yyyy-mm-dd):");
        String dataFim = (scanner.nextLine());
        System.out.println("Nome do professor responsável:");
        String nomeProfessor = scanner.nextLine();

        Professor professorResponsavel = professores.stream()
                .filter(prof -> prof.getNome().equals(nomeProfessor))
                .findFirst()
                .orElse(null);

        if (professorResponsavel == null) {
            System.out.println("Professor não encontrado.");
            return;
        }

        ProjetoPesquisa projeto = new ProjetoPesquisa(codigo, titulo, dataInicio, dataFim, professorResponsavel);
        projetos.add(projeto);
        System.out.println("Projeto cadastrado com sucesso.");
    }

    private static void adicionarIntegrante(Scanner scanner) {
        System.out.println("Código do projeto:");
        String codigo = scanner.nextLine();
        ProjetoPesquisa projeto = projetos.stream()
                .filter(proj -> proj.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);

        if (projeto == null) {
            System.out.println("Projeto não encontrado.");
            return;
        }

        System.out.println("Nome do integrante:");
        String nome = scanner.nextLine();
        Pesquisador pesquisador = professores.stream()
                .filter(prof -> prof.getNome().equals(nome))
                .findFirst()
                .orElse(null);

        if (pesquisador == null) {
            pesquisador = alunos.stream()
                    .filter(aluno -> aluno.getNome().equals(nome))
                    .findFirst()
                    .orElse(null);
        }

        if (pesquisador == null) {
            System.out.println("Integrante não encontrado.");
            return;
        }

        projeto.adicionarPesquisador(pesquisador);
        System.out.println("Integrante adicionado com sucesso.");
    }

    private static void mostrarDadosProjeto(Scanner scanner) {
        System.out.println("Código do projeto:");
        String codigo = scanner.nextLine();
        ProjetoPesquisa projeto = projetos.stream()
                .filter(proj -> proj.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);

        if (projeto == null) {
            System.out.println("Projeto não encontrado.");
            return;
        }

        System.out.println("Título: " + projeto.getTitulo());
        System.out.println("Data de Início: " + projeto.getDataInicio());
        System.out.println("Data de Fim: " + projeto.getDataFim());
        System.out.println("Professor Responsável: " + projeto.getProfessorResponsavel().getNome());
        System.out.println("Equipe:");
        for (Pesquisador pesquisador : projeto.getEquipe()) {
            System.out.println("Nome: " + pesquisador.getNome() + ", Tipo: " + pesquisador.getTipo());
        }
    }
}
