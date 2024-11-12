package br.com.exemplo.memento.component;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Cria um memento para salvar o estado atual
    public Memento saveToMemento() {
        return new Memento(text);
    }

    // Restaura o estado a partir de um memento
    public void restoreFromMemento(Memento memento) {
        text = memento.getState();
    }

    // Classe interna Memento que armazena o estado
    public static class Memento {
        private final String text;

        public Memento(String text) {
            this.text = text;
        }

        private String getState() {
            return text;
        }
    }
}