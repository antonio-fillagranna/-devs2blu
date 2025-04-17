package fontes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContatoTest {

    @Test
    void criarContatoComNomeValido() {
        assertDoesNotThrow(() -> new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "12345678909"));
    }

    @Test
    void criarContatoComNomeNulo() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato(null, "joao.silva@email.com", "SenhaForte@123", "12345678909"));
        assertEquals("Nome deve ter mais de 3 caracteres.", exception.getMessage());
    }

    @Test
    void criarContatoComNomeCurto() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("Ana", "joao.silva@email.com", "SenhaForte@123", "12345678909"));
        assertEquals("Nome deve ter mais de 3 caracteres.", exception.getMessage());
    }

    @Test
    void criarContatoComEmailValido() {
        assertDoesNotThrow(() -> new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "12345678909"));
    }

    @Test
    void criarContatoComEmailNulo() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", null, "SenhaForte@123", "12345678909"));
        assertEquals("Email inválido. Deve conter '@' e um formato válido.", exception.getMessage());
    }

    @Test
    void criarContatoComEmailSemArroba() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silvaemail.com", "SenhaForte@123", "12345678909"));
        assertEquals("Email inválido. Deve conter '@' e um formato válido.", exception.getMessage());
    }

    @Test
    void criarContatoComEmailFormatoInvalido() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@", "SenhaForte@123", "12345678909"));
        assertEquals("Email inválido. Deve conter '@' e um formato válido.", exception.getMessage());
    }

    @Test
    void criarContatoComSenhaValida() {
        assertDoesNotThrow(() -> new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "12345678909"));
    }

    @Test
    void criarContatoComSenhaNula() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", null, "12345678909"));
        assertEquals("Senha inválida. Deve ter mais de 5 caracteres e conter pelo menos um número, uma letra minúscula, uma letra maiúscula e um caractere especial.", exception.getMessage());
    }

    @Test
    void criarContatoComSenhaCurta() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", "Senha", "12345678909"));
        assertEquals("Senha inválida. Deve ter mais de 5 caracteres e conter pelo menos um número, uma letra minúscula, uma letra maiúscula e um caractere especial.", exception.getMessage());
    }

    @Test
    void criarContatoComSenhaSemNumero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", "SenhaForte@", "12345678909"));
        assertEquals("Senha inválida. Deve ter mais de 5 caracteres e conter pelo menos um número, uma letra minúscula, uma letra maiúscula e um caractere especial.", exception.getMessage());
    }

    @Test
    void criarContatoComSenhaSemMinuscula() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", "SENHAFORTE@1", "12345678909"));
        assertEquals("Senha inválida. Deve ter mais de 5 caracteres e conter pelo menos um número, uma letra minúscula, uma letra maiúscula e um caractere especial.", exception.getMessage());
    }

    @Test
    void criarContatoComSenhaSemMaiuscula() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", "senhaforte@1", "12345678909"));
        assertEquals("Senha inválida. Deve ter mais de 5 caracteres e conter pelo menos um número, uma letra minúscula, uma letra maiúscula e um caractere especial.", exception.getMessage());
    }

    @Test
    void criarContatoComSenhaSemEspecial() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", "SenhaForte123", "12345678909"));
        assertEquals("Senha inválida. Deve ter mais de 5 caracteres e conter pelo menos um número, uma letra minúscula, uma letra maiúscula e um caractere especial.", exception.getMessage());
    }

    @Test
    void criarContatoComSenhaComEspaco() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", "Senha Forte@123", "12345678909"));
        assertEquals("Senha inválida. Deve ter mais de 5 caracteres e conter pelo menos um número, uma letra minúscula, uma letra maiúscula e um caractere especial.", exception.getMessage());
    }

    @Test
    void criarContatoComCpfValido() {
        assertDoesNotThrow(() -> new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "12345678909"));
        assertDoesNotThrow(() -> new Contato("Maria Souza", "maria.souza@email.com", "OutraSenha!1", "83342071079"));
        assertDoesNotThrow(() -> new Contato("Pedro Alves", "pedro.alves@email.com", "Senha123#@", "26838407051"));
    }

    @Test
    void criarContatoComCpfNulo() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", null));
        assertEquals("CPF inválido.", exception.getMessage());
    }

    @Test
    void criarContatoComCpfComComprimentoInvalidoMenor() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "1234567890"));
        assertEquals("CPF inválido.", exception.getMessage());
    }

    @Test
    void criarContatoComCpfComComprimentoInvalidoMaior() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "123456789091"));
        assertEquals("CPF inválido.", exception.getMessage());
    }

    @Test
    void criarContatoComCpfComTodosDigitosIguais() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "11111111111"));
        assertEquals("CPF inválido.", exception.getMessage());
    }

    @Test
    void criarContatoComCpfInvalidoDigitoVerificador1() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "12345678910"));
        assertEquals("CPF inválido.", exception.getMessage());
    }

    @Test
    void criarContatoComCpfInvalidoDigitoVerificador2() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "12345678900"));
        assertEquals("CPF inválido.", exception.getMessage());
    }

    @Test
    void criarContatoComCpfValidoQueCobreRestoMaiorOuIgualA10NoSegundoDigito() {
        assertDoesNotThrow(() -> new Contato("Teste Coverage", "teste@email.com", "SenhaForte@123", "01234567890"));
    }

    @Test
    void getNomeRetornaValorCorreto() {
        Contato contato = new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "12345678909");
        assertEquals("João Silva", contato.getNome());
    }

    @Test
    void getEmailRetornaValorCorreto() {
        Contato contato = new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "12345678909");
        assertEquals("joao.silva@email.com", contato.getEmail());
    }

    @Test
    void getSenhaRetornaValorCorreto() {
        Contato contato = new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "12345678909");
        assertEquals("SenhaForte@123", contato.getSenha());
    }

    @Test
    void getCpfRetornaValorCorreto() {
        Contato contato = new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "12345678909");
        assertEquals("12345678909", contato.getCpf());
    }

    @Test
    void getIdRetornaValorNaoNulo() {
        Contato contato = new Contato("João Silva", "joao.silva@email.com", "SenhaForte@123", "12345678909");
        assertNotNull(contato.getId());
    }

}