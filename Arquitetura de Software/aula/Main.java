package alan.aula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaLogin sistemaLogin = new SistemaLogin();
        Estoque estoqueGeral = new Estoque();
        Estoque estoqueSuprimentos = new Estoque();
        Scanner entrada = new Scanner(System.in);

        // Adicionando usuários
        Logistica logistica = new Logistica("1", "Alice", "1", 3000, "01/01/1980", "123456789", "alice@example.com", "Rua A, 123", false, "Ensino Médio Completo", "123456789");
        Juridico juridico = new Juridico("2", "Bob", "2", 3500, "02/02/1985", "987654321", "bob@example.com", "Rua B, 456", false, "Ensino Superior Completo", "987654321");
        Financeiro financeiro = new Financeiro("3", "Carlos", "3", 3200, "03/03/1990", "456789123", "carlos@example.com", "Rua C, 789", false, "Ensino Superior Completo");
        GestaoEstrat gestaoEstrat = new GestaoEstrat("4", "Diana", "4", 4000, "04/04/1975", "789123456", "diana@example.com", "Rua D, 012", false, "Ensino Superior Completo");
        Comercial comercial = new Comercial("5", "Elena", "5", 3000, 500, "05/05/1988", "159357852", "elena@example.com", "Rua E, 345", false, "Ensino Superior Completo");
        RH rh = new RH("6", "Fernando", "6", 2800, "06/06/1982", "753951456", "fernando@example.com", "Rua F, 678", false, "Ensino Superior Completo");
        TI ti = new TI("7", "Gustavo", "7", 3500, "07/07/1995", "951753456", "gustavo@example.com", "Rua G, 901", false, "Ensino Superior Completo");
        Faturamento faturamento = new Faturamento("8", "Helena", "8", 3300, "08/08/1986", "852741963", "helena@example.com", "Rua H, 234", false, "Ensino Superior Completo");
        Producao producao = new Producao("9", "Igor", "9", 3100, "09/09/1989", "654321789", "igor@example.com", "Rua I, 567", false, "Ensino Médio Completo");
        Suprimentos suprimentos = new Suprimentos("10", "Julia", "10", 3400, "10/10/1978", "321654987", "julia@example.com", "Rua J, 890", false, "Ensino Superior Completo");

        sistemaLogin.adicionarUsuario(logistica);
        sistemaLogin.adicionarUsuario(juridico);
        sistemaLogin.adicionarUsuario(financeiro);
        sistemaLogin.adicionarUsuario(gestaoEstrat);
        sistemaLogin.adicionarUsuario(comercial);
        sistemaLogin.adicionarUsuario(rh);
        sistemaLogin.adicionarUsuario(ti);
        sistemaLogin.adicionarUsuario(faturamento);
        sistemaLogin.adicionarUsuario(producao);
        sistemaLogin.adicionarUsuario(suprimentos);

        // Adicionando chamados no TI
        ti.adicionarChamado("1", "Aberto");
        ti.adicionarChamado("3", "Fechado");
        
        // Adicionar produtos ao estoque geral
        Produto caneta = new Produto("Caneta", 100);
        Produto papel = new Produto("Papel", 200);
        estoqueGeral.adicionarProduto(caneta);
        estoqueGeral.adicionarProduto(papel);

        // Adicionar produtos ao estoque de suprimentos
        Produto teclado = new Produto("Teclado", 50);
        Produto mouse = new Produto("Mouse", 75);
        estoqueSuprimentos.adicionarProduto(teclado);
        estoqueSuprimentos.adicionarProduto(mouse);

        // Simulação de login e execução de ações
        System.out.print("Digite seu CPF para fazer login: ");
        String cpf = entrada.nextLine();
        Pessoa pessoaLogada = sistemaLogin.login(cpf);

        if (pessoaLogada != null) {
            System.out.println("Login bem-sucedido! Bem-vindo(a), " + pessoaLogada.getNome());
            System.out.println("Você faz parte do setor: " + pessoaLogada.retornaSetor());
            SistemaPermissoes.executarAcoes(pessoaLogada, estoqueGeral, estoqueSuprimentos);

        } else {
            System.out.println("CPF não encontrado. Tente novamente.");
        }

        entrada.close();
    }
}

