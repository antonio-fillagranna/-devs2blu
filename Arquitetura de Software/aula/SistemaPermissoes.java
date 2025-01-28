package alan.aula;

public class SistemaPermissoes {
    // Método para verificar permissões e executar ações específicas
    public static void executarAcoes(Pessoa pessoa, Estoque estoque, Estoque estoqueSuprimentos) {
        pessoa.executarFuncao();
        if (pessoa instanceof Logistica) {
            ((Logistica) pessoa).consultaEstoque(estoque);
        } else if (pessoa instanceof Suprimentos) {
            ((Suprimentos) pessoa).consultaSuprimentos(estoqueSuprimentos);
        }
    }
}
