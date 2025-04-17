package testes;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fontes.Contato;

class ContatoTest {
   private Contato contato;
   
   @BeforeEach
   void setup() {
	  contato = new Contato();
   }
   
	@Test
	@DisplayName("Deve lançar RuntimeException se nome com menos de três caracteres")
	void test() {
		RuntimeException ex = assertThrows(RuntimeException.class, ()->{
			contato.setNome("ze");
		});
		assertEquals("O nome deve ter no mínimo 3 caracteres", ex.getMessage());
		assertNotNull(ex);
	}
	
	@Test
	void ShouldReturnNameWhenSetNameWithMoreTwoLetter() {
		contato.setNome("Ana");
		assertEquals("Ana", contato.getNome());
	}
	
	@Test
	void ShouldReturnEmailWhenSetEmailCorrect() {
		contato.setEmail("ana@gmail.com");
		assertEquals("ana@gmail.com", contato.getEmail());
	}
	
	@Test
	void shouldThrowRuntimeExceptionWhenEmailInvalido() {
		RuntimeException ex = assertThrows(RuntimeException.class, ()->{
			contato.setEmail("jose.gmail.com");
		});
		assertEquals("Email inválido", ex.getMessage());
		assertNotNull(ex);
	}
    
	@Test
	void ShouldReturnSenhaWhenSetSenhaMoreThanFourLetters() {
		assertDoesNotThrow(() -> contato.setSenha("Abc@123"));
        assertEquals("Abc@123", contato.getSenha());		
	}
	
	@Test
    void deveRejeitarSenhaNula() {
        RuntimeException ex = assertThrows(RuntimeException.class, () -> contato.setSenha(null));
        assertEquals("Senha inválida: deve ter pelo menos 5 caracteres.", ex.getMessage());
    }
	
	@Test
    void deveRejeitarSenhaCurta() {
        RuntimeException ex = assertThrows(RuntimeException.class, () -> contato.setSenha("A1@b"));
        assertEquals("Senha inválida: deve ter pelo menos 5 caracteres.", ex.getMessage());
    }
	
	@Test
    void deveRejeitarSenhaSemMaiuscula() {
        RuntimeException ex = assertThrows(RuntimeException.class, () -> contato.setSenha("abc@123"));
        assertEquals("Senha deve conter pelo menos uma letra MAIÚSCULA.", ex.getMessage());
    }

    @Test
    void deveRejeitarSenhaSemMinuscula() {
        RuntimeException ex = assertThrows(RuntimeException.class, () -> contato.setSenha("ABC@123"));
        assertEquals("Senha deve conter pelo menos uma letra minúscula.", ex.getMessage());
    }

    @Test
    void deveRejeitarSenhaSemNumero() {
        RuntimeException ex = assertThrows(RuntimeException.class, () -> contato.setSenha("Abc@def"));
        assertEquals("Senha deve conter pelo menos um número.", ex.getMessage());
    }

    @Test
    void deveRejeitarSenhaSemSimbolo() {
        RuntimeException ex = assertThrows(RuntimeException.class, () -> contato.setSenha("Abc12345"));
        assertEquals("Senha deve conter pelo menos um símbolo.", ex.getMessage());
    }

	
}
