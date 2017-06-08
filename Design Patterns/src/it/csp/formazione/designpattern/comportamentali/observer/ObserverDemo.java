package it.csp.formazione.designpattern.comportamentali.observer;

public class ObserverDemo {

	public static void main(String[] args) 
	{
		Prodotto fender = new Prodotto("Fender Stratocaster");
		
		Consumatore mario = new Consumatore("Mario");
		mario.setProdotto(fender);
		
		Consumatore pino = new Consumatore("Pino");
		pino.setProdotto(fender);
		
		Prodotto gibson = new Prodotto("Gibson Les Paul");

		Consumatore gino = new Consumatore("Gino");
		gino.setProdotto(gibson);

		Consumatore rino = new Consumatore("Rino");
		rino.setProdotto(gibson);
		
		fender.setInSaldo(true);		
		gibson.setInSaldo(true);
	}

}
