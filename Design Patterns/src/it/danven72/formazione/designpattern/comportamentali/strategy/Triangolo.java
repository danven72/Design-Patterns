package it.danven72.formazione.designpattern.comportamentali.strategy;

public class Triangolo implements FiguraPiana {

	private int base;
	private int lato2;
	private int lato3;
	private int altezza;
	
	public Triangolo(int base, int lato2, int lato3, int altezza) {
		this.base = base;
		this.altezza = altezza;
		this.lato2 = lato2;
		this.lato3 = lato3;
	}
	
	@Override
	public int getNumeroLati() {
		return 3;
	}

	@Override
	public int area() {
		return (base*altezza)/2;
	}

	@Override
	public int perimetro() {
		
		return base+lato2+lato3;
	}

}
