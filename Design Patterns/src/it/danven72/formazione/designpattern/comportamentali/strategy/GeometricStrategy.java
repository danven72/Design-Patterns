package it.danven72.formazione.designpattern.comportamentali.strategy;

public class GeometricStrategy implements GeometricStrategyITF {

	private FiguraPiana figuraPiana;
	
	@Override
	public void printArea() {
		System.out.println("Area: "+getFiguraPiana().area());
	}

	@Override
	public void printLati() {
		System.out.println("Numero Lati: "+getFiguraPiana().getNumeroLati());
	}

	@Override
	public void printPerimetro() {
		System.out.println("Perimetro: "+getFiguraPiana().perimetro());
	}

	private FiguraPiana getFiguraPiana() {
		return figuraPiana;
	}

	public void setFiguraPiana(FiguraPiana figuraPiana) {
		this.figuraPiana = figuraPiana;
	}

	@Override
	public void printName() {
		System.out.println(getFiguraPiana().getName()+":");	
	}
	
	

}
