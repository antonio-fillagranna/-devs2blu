package alan.aula;

public class Comercial extends Pessoa {
    private double comissao;

    // Construtor
    public Comercial(String identificacaoUnica, String nome, String cpf, double salario, double comissao, String dataNascimento, String telefone, String email, String endereco, boolean pcd, String escolaridade) {
        super(identificacaoUnica, nome, "Comercial", cpf, salario, dataNascimento, telefone, email, endereco, pcd, escolaridade, "Comercial");
        this.comissao = comissao;
    }

    // Métodos específicos
    public void emitirMeta() {
        System.out.println("Emitindo meta...");
    }

    public void consultaMeta() {
        System.out.println("Consultando metas...");
    }

    public void realizarVenda(String cliente, String endereco, Produto produto) {
        System.out.println("Venda realizada para " + cliente + " - " + endereco);
        System.out.println("Produto vendido: " + produto.getNome() + " - Quantidade: " + produto.getQuantidade());
        // Registra a venda no sistema de Faturamento
        SistemaFaturamento.registrarVenda(cliente, endereco, produto);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void executarFuncao() {
        emitirMeta();
        consultaMeta();
        realizarVenda("Jorge", "Rua Rio branco", new Produto("Papel", 10));
    }
}
