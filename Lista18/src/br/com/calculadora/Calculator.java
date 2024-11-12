package br.com.calculadora;

import br.com.calculadora.memory.*;

public class Calculator {
    private double currentValue = 0.0;
    private CareTaker careTaker = new CareTaker();

    public double getCurrentValue() {
        return currentValue;
    }

    // Executa uma operação e salva o estado
    public void executeOperation(String operation, double value) {
        careTaker.addMemento(new Memento(currentValue)); // Salva o estado atual

        switch (operation) {
            case "+":
                currentValue += value;
                break;
            case "-":
                currentValue -= value;
                break;
            case "*":
                currentValue *= value;
                break;
            case "/":
                if (value != 0) {
                    currentValue /= value;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
        careTaker.clearRedo(); // Limpa a lista de redo sempre que uma nova operação é feita
    }

    // Desfaz a última operação
    public void undo() {
        Memento memento = careTaker.getLastMemento();
        if (memento != null) {
            careTaker.addRedoMemento(new Memento(currentValue)); // Salva o estado atual para redo
            currentValue = memento.getState();
        } else {
            System.out.println("Nada para desfazer.");
        }
    }

    // Refaz a última operação desfeita
    public void redo() {
        Memento memento = careTaker.getLastRedoMemento();
        if (memento != null) {
            careTaker.addMemento(new Memento(currentValue)); // Salva o estado atual para undo
            currentValue = memento.getState();
        } else {
            System.out.println("Nada para refazer.");
        }
    }

    // Memento para armazenar o estado
    public static class Memento {
        private final double state;

        public Memento(double state) {
            this.state = state;
        }

        public double getState() {
            return state;
        }
    }
}

