package it.csp.formazione.designpattern.comportamentali.mediaor;

public interface ITOperationMediator {

	public int sommaESottrai(int addendo1, int addendo2, int minuendo);
	public int moltiplicaEDividi(int fattore1, int fattore2, int divisore);
	public int moltiplicaESottrai(int fattore1, int fattore2, int minuendo);
}
