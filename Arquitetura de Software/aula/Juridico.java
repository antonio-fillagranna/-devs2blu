package alan.aula;

public class Juridico extends Pessoa {
    private String oab;

    // Construtor
    public Juridico(String identificacaoUnica, String nome, String cpf, double salario, String dataNascimento, String telefone, String email, String endereco, boolean pcd, String escolaridade, String oab) {
        super(identificacaoUnica, nome, "Juridico", cpf, salario, dataNascimento, telefone, email, endereco, pcd, escolaridade, "Juridico");
        this.oab = oab;
    }

    // Métodos específicos
    public void validarOAB() {
        System.out.println("Validando OAB...");
    }

    public void redigirContratos() {
        System.out.println("Redigindo contratos para o RH contratar...");
    }

    @Override
    public void executarFuncao() {
        validarOAB();
        redigirContratos();
    }
}
