package alan.aula;

public abstract class Pessoa {
    private String identificacaoUnica;
    private String nome;
    private String cargo;
    private String cpf;
    private double salario;
    private String dataNascimento;
    private String telefone;
    private String email;
    private String endereco;
    private boolean pcd;
    private String escolaridade;
    private String setor;

    // Construtor
    public Pessoa(String identificacaoUnica, String nome, String cargo, String cpf, double salario, String dataNascimento, String telefone, String email, String endereco, boolean pcd, String escolaridade, String setor) {
        this.identificacaoUnica = identificacaoUnica;
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.pcd = pcd;
        this.escolaridade = escolaridade;
        this.setor = setor;
    }

    // Getters e Setters
    public String getIdentificacaoUnica() {
        return identificacaoUnica;
    }

    public void setIdentificacaoUnica(String identificacaoUnica) {
        this.identificacaoUnica = identificacaoUnica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isPcd() {
        return pcd;
    }

    public void setPcd(boolean pcd) {
        this.pcd = pcd;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    // Método para retornar o setor
    public String retornaSetor() {
        return this.setor;
    }

    // Método abstrato para funções específicas
    public abstract void executarFuncao();
}
