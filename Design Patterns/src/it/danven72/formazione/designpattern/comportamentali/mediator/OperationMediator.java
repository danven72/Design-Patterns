package it.danven72.formazione.designpattern.comportamentali.mediator;

public class OperationMediator implements ITOperationMediator {
	private Calcolo somma;
	private Calcolo sottrazione;
	private Calcolo moltiplicazione;
	private Calcolo divisione;
	
	public OperationMediator() {
		somma = new Somma();
		sottrazione = new Sottrazione();
		moltiplicazione = new Moltiplicazione();
		divisione = new Divisione();
	}
	
	@Override
	public int sommaESottrai(int addendo1, int addendo2, int minuendo) {
		
		int result = getSomma().esegui(addendo1, addendo2);
		result = getSottrazione().esegui(result, minuendo);
		return result;
	}
	@Override
	public int moltiplicaEDividi(int fattore1, int fattore2, int divisore) {
		int result = getMoltiplicazione().esegui(fattore1, fattore2);
		result = getDivisione().esegui(result, divisore);
		return result;
	}

	@Override
	public int moltiplicaESottrai(int fattore1, int fattore2, int minuendo) {
		int result = getMoltiplicazione().esegui(fattore1, fattore2);
		result = getSottrazione().esegui(result, minuendo);
		
		return result;		
	}

	private Calcolo getSomma() {
		return somma;
	}

	private Calcolo getSottrazione() {
		return sottrazione;
	}

	private Calcolo getMoltiplicazione() {
		return moltiplicazione;
	}

	private Calcolo getDivisione() {
		return divisione;
	}

	
	
}
