package br.com.exemplo.memento;

import br.com.exemplo.memento.component.TextEditor;
import br.com.exemplo.memento.memory.CareTaker;

public class MementoMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker caretaker = new CareTaker();

        // Criando 6 versões para exceder o limite
        for (int i = 1; i <= 6; i++) {
            editor.setText("Versão " + i);
            caretaker.addMemento(editor.saveToMemento());
        }

        // Desfazendo 5 vezes (deveria voltar para a Versão 1)
        for (int i = 0; i < 5; i++) {
            editor.restoreFromMemento(caretaker.getLastMemento());
            System.out.println("Após desfazer " + (i+1) + " vez(es): " + editor.getText());
        }

    }
}