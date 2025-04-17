package fontes;

import java.util.UUID;

public class Contato {
    private UUID id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;

    public Contato(String nome, String email, String senha, String cpf) {
        this.id = UUID.randomUUID();
        setNome(nome);
        setEmail(email);
        setSenha(senha);
        setCpf(cpf);
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.length() <= 3) {
            throw new IllegalArgumentException("Nome deve ter mais de 3 caracteres.");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new IllegalArgumentException("Email inválido. Deve conter '@' e um formato válido.");
        }
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.length() <= 5 || !senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{6,}$")) {
            throw new IllegalArgumentException("Senha inválida. Deve ter mais de 5 caracteres e conter pelo menos um número, uma letra minúscula, uma letra maiúscula e um caractere especial.");
        }
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || !isValidCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.cpf = cpf;
    }

    private boolean isValidCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11) {
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int resto = 11 - (soma % 11);
        int digito1 = (resto >= 10) ? 0 : resto;

        if ((cpf.charAt(9) - '0') != digito1) {
            return false;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        resto = 11 - (soma % 11);
        int digito2 = (resto >= 10) ? 0 : resto;

        if ((cpf.charAt(10) - '0') != digito2) {
            return false;
        }

        return true;
    }
}