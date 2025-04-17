package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fontes.Calculadora;

class CalculadoraTest {
	Calculadora calculadora;
	double valorEsperado;
	double valorRetornado;

	@BeforeEach
	void setup() {
		calculadora = new Calculadora();
		valorEsperado = 20.0;
		valorRetornado = 0.0;
	}

	@Test
	@DisplayName("Teste unitário da função somar")
	void test() {
		valorRetornado = calculadora.somar(15.0, 5.0);
		assertEquals(valorEsperado, valorRetornado);
		assertTrue(10 == calculadora.somar(15.0, -5.0));
	}

	@Test
	void whenAddFifteenWithFiveThenReturnTwenty() {
		valorRetornado = calculadora.somar(15.0, 5.0);
		assertEquals(valorEsperado, valorRetornado);
	}

	@Test
	void whenDivideTwentyByTwoThenReturnTen() {
		valorEsperado = 10.0;
		valorRetornado = calculadora.dividir(20.0, 2.0);
		assertEquals(valorEsperado, valorRetornado);
	}

	@Test
	void whenDivideByZeroShouldThrowException() {
		RuntimeException exception = assertThrows(RuntimeException.class, () -> {
			calculadora.dividir(20.0, 0.0);
		});
		assertEquals("Não é possivel dividir por zero", exception.getMessage());
	}

	/*
	 * Red Refator Green
	 */

}
