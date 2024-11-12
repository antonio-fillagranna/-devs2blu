package br.com.calculadora.component;

import br.com.calculadora.*;

public class MementoCalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.executeOperation("+", 5);
        System.out.println("Valor atual: " + calculator.getCurrentValue());  // Exibe "5.0"

        calculator.executeOperation("-", 2);
        System.out.println("Valor atual: " + calculator.getCurrentValue());  // Exibe "3.0"

        calculator.undo();
        System.out.println("Após desfazer uma vez: " + calculator.getCurrentValue());  // Exibe "5.0"

        calculator.redo();
        System.out.println("Após refazer: " + calculator.getCurrentValue());  // Exibe "3.0"

        calculator.executeOperation("*", 10);
        System.out.println("Valor atual: " + calculator.getCurrentValue());  // Exibe "30.0"

        calculator.undo();
        System.out.println("Após desfazer novamente: " + calculator.getCurrentValue());  // Exibe "3.0"
    }
}
