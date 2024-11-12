package br.com.calculadora.memory;

import br.com.calculadora.*;

import java.util.LinkedList;

public class CareTaker {
    private LinkedList<Calculator.Memento> undoList = new LinkedList<>();
    private LinkedList<Calculator.Memento> redoList = new LinkedList<>();
    private static final int MAX_SIZE = 5;

    // Adiciona um novo memento para undo e limpa o redo
    public void addMemento(Calculator.Memento memento) {
        if (undoList.size() == MAX_SIZE) {
            undoList.removeFirst(); // Remove o memento mais antigo
        }
        undoList.addLast(memento);
    }

    // Recupera o último memento salvo em undo e move para redo
    public Calculator.Memento getLastMemento() {
        if (!undoList.isEmpty()) {
            return undoList.removeLast();
        }
        return null;
    }

    // Adiciona um memento para a lista de redo
    public void addRedoMemento(Calculator.Memento memento) {
        if (redoList.size() == MAX_SIZE) {
            redoList.removeFirst(); // Remove o memento mais antigo
        }
        redoList.addLast(memento);
    }

    // Recupera o último memento salvo em redo
    public Calculator.Memento getLastRedoMemento() {
        if (!redoList.isEmpty()) {
            return redoList.removeLast();
        }
        return null;
    }

    // Limpa a lista de redo
    public void clearRedo() {
        redoList.clear();
    }
}
