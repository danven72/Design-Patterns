package it.csp.formazione.designpattern.strutturali.adapter;

public class PresaElettrica {
	
	public Corrente getCorrente()
	{
		return new Corrente(120);
	}
}
