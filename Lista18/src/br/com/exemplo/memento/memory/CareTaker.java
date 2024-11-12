package br.com.exemplo.memento.memory;

import java.util.*;

import br.com.exemplo.memento.component.TextEditor;

public class CareTaker {
    private static final int MAX_UNDO_STEPS = 5;
    private Queue<TextEditor.Memento> savedStates = new LinkedList<>();

    // Adiciona um novo memento � lista
    public void addMemento(TextEditor.Memento memento) {
        savedStates.add(memento);
        // Remove o memento mais antigo se o limite for excedido
        if (savedStates.size() > MAX_UNDO_STEPS) {
            savedStates.poll();
        }
    }

    // Recupera o �ltimo memento salvo e remove-o da lista
    public TextEditor.Memento getLastMemento() {
        return savedStates.poll();
    }
}