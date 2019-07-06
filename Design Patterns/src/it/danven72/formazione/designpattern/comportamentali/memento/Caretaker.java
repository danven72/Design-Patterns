package it.danven72.formazione.designpattern.comportamentali.memento;

import java.util.ArrayList;

public class Caretaker {
	
	private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {
        getMementos().add(m);
    }

    public Memento getMemento() {
        if (getMementos().size() >0)
    	{
        	Memento m = getMementos().get((getMementos().size()-1));
        	getMementos().remove(getMementos().size()-1);
        	
        	return m;
    	}
        else throw new IllegalStateException("No memento memorized!");
    }

	private ArrayList<Memento> getMementos() {
		return mementos;
	}
}
