package it.csp.formazione.designpattern.strutturali.adapter;

public class PresaCorrente {
	
	public Corrente getCorrente()
	{
		return new Corrente(120);
	}
}
