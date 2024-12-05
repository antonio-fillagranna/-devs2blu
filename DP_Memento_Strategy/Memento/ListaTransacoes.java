package Memento;

import java.util.ArrayList;

public class ListaTransacoes {
	public ArrayList<TransacaoEditor.Memento> savedStates = new ArrayList<>();
	
	// Adiciona um novo memento � lista
    public void addMemento(TransacaoEditor.Memento memento) {
    	if (savedStates.size() > 4) {
    		savedStates.remove(0);
        	savedStates.add(memento);
    	}else {
    		savedStates.add(memento);
    	}
    }

    // Recupera o �ltimo memento salvo e remove-o da lista
    public TransacaoEditor.Memento getLastMemento() {
        if (savedStates.size() > 0) {
            return savedStates.remove(savedStates.size() - 1);
        }
        return null;
    }

	@Override
	public String toString() {
		String informacao = "";
		for(TransacaoEditor.Memento memento : savedStates) {
			informacao = informacao+memento.toString()+"\n";
		}
		return informacao;
	}
	
	
}