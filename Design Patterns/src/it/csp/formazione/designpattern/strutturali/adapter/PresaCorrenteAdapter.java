package it.csp.formazione.designpattern.strutturali.adapter;

public interface PresaCorrenteAdapter 
{
	public Corrente get120Volt();
	
	public Corrente get12Volt();
	
	public Corrente get3Volt();
}
