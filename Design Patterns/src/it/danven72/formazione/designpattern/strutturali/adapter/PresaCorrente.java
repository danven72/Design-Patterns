package it.danven72.formazione.designpattern.strutturali.adapter;

public class PresaCorrente {
	
	public Corrente getCorrente()
	{
		return new Corrente(120);
	}
}
