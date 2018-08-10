package it.danven72.formazione.designpattern.comportamentali.mediator;

public class Moltiplicazione implements Calcolo {

	@Override
	public int esegui(int x, int y) {
		return x*y;
	}

}
