package it.danven72.formazione.designpattern.comportamentali.memento;

public class Memento {
	private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
