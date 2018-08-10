package it.danven72.formazione.designpattern.comportamentali.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyDemo {
	public static void main(String[] args) {
		
		List<FiguraPiana> figureList = new ArrayList<FiguraPiana>();	
		FiguraPiana quadrato = new Quadrato(7);
		figureList.add(quadrato);
		
		FiguraPiana rettangolo = new Rettangolo(5, 12);
		figureList.add(rettangolo);
		
		FiguraPiana triangolo = new Triangolo(4, 12, 6, 9);
		figureList.add(triangolo);
		
		GeometricStrategy geometricStrategy = new GeometricStrategy();
		
		for(FiguraPiana f : figureList) {
			
			geometricStrategy.setFiguraPiana(f);
			geometricStrategy.printName();
			geometricStrategy.printLati();
			geometricStrategy.printArea();
			geometricStrategy.printPerimetro();
			System.out.println();
		}
		
	}
}
