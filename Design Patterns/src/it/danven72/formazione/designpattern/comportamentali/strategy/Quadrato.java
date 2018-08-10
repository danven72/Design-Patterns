package it.danven72.formazione.designpattern.comportamentali.strategy;

public class Quadrato implements FiguraPiana {

	private int lato;
	
	public Quadrato(int lato) {
		this.lato = lato;
	}
	
	@Override
	public int getNumeroLati() {
		return 4;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return lato*lato;
	}

	@Override
	public int perimetro() {
		// TODO Auto-generated method stub
		return lato*getNumeroLati();
	}

}
