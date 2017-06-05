package it.csp.formazione.designpattern.strutturali.decorator;

public class DecoratorPatternDemo {
	
	public static void main(String[] args) {
		Forma cerchio = new Cerchio();
		Forma rettangolo = new Rettangolo();
		
		Forma cerchioRosso = new FormaRossaDecorator(new Cerchio());
		Forma rettangoloRosso = new FormaRossaDecorator(new Rettangolo());
		
		System.out.print("Output cerchio: ");
		cerchio.disegna();
		
		System.out.print("Output cerchioRosso: ");
		cerchioRosso.disegna();
		
		System.out.print("Output rettangolo: ");
		rettangolo.disegna();
		
		System.out.print("Output rettangoloRosso: ");
		rettangoloRosso.disegna();

		
	}
}
