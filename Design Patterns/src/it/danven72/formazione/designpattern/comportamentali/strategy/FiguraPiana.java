package it.danven72.formazione.designpattern.comportamentali.strategy;

public interface FiguraPiana {

	public int getNumeroLati();
	public int area();
	public int perimetro();
	
	default public String getName() {
		return getClass().getSimpleName();
	}

}
