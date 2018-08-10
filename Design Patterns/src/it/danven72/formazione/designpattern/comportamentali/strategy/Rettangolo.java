package it.danven72.formazione.designpattern.comportamentali.strategy;

public class Rettangolo implements FiguraPiana {

	private int base;
	private int altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	@Override
	public int getNumeroLati() {
		return 4;
	}

	@Override
	public int area() {
		return base*altezza;
	}

	@Override
	public int perimetro() {
		return 2*(base+altezza);
	}

}
