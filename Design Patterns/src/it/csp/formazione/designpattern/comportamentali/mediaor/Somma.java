package it.csp.formazione.designpattern.comportamentali.mediaor;

public class Somma implements Calcolo {

	@Override
	public int esegui(int x, int y) {
		return x+y;
	}

}