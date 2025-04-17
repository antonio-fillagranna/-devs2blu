package fontes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(5.0, calculadora.somar(2.0, 3.0), "A soma de 2.0 e 3.0 deve ser 5.0");
        assertEquals(-1.0, calculadora.somar(1.0, -2.0), "A soma de 1.0 e -2.0 deve ser -1.0");
        assertEquals(0.0, calculadora.somar(0.0, 0.0), "A soma de 0.0 e 0.0 deve ser 0.0");
    }

    @Test
    void testSubtrair() {
        assertEquals(1.0, calculadora.subtrair(3.0, 2.0), "A subtração de 3.0 por 2.0 deve ser 1.0");
        assertEquals(3.0, calculadora.subtrair(1.0, -2.0), "A subtração de 1.0 por -2.0 deve ser 3.0");
        assertEquals(0.0, calculadora.subtrair(5.0, 5.0), "A subtração de 5.0 por 5.0 deve ser 0.0");
    }

    @Test
    void testMultiplicar() {
        assertEquals(6.0, calculadora.multiplicar(2.0, 3.0), "A multiplicação de 2.0 por 3.0 deve ser 6.0");
        assertEquals(-2.0, calculadora.multiplicar(1.0, -2.0), "A multiplicação de 1.0 por -2.0 deve ser -2.0");
        assertEquals(0.0, calculadora.multiplicar(5.0, 0.0), "A multiplicação de 5.0 por 0.0 deve ser 0.0");
    }

    @Test
    void testDividir() {
        assertEquals(2.0, calculadora.dividir(6.0, 3.0), "A divisão de 6.0 por 3.0 deve ser 2.0");
        assertEquals(-0.5, calculadora.dividir(1.0, -2.0), "A divisão de 1.0 por -2.0 deve ser -0.5");
    }

    @Test
    void testDividirPorZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(5.0, 0.0);
        });
        assertEquals("Impossível dividir por zero!", exception.getMessage(), "A mensagem de erro deve ser 'Impossível dividir por zero!'");
    }

}