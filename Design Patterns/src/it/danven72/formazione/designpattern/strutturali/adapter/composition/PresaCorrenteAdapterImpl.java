package it.danven72.formazione.designpattern.strutturali.adapter.composition;

import it.danven72.formazione.designpattern.strutturali.adapter.Corrente;
import it.danven72.formazione.designpattern.strutturali.adapter.PresaCorrente;
import it.danven72.formazione.designpattern.strutturali.adapter.PresaCorrenteAdapter;

public class PresaCorrenteAdapterImpl implements PresaCorrenteAdapter {

	private PresaCorrente presaCorrente;
	
	public PresaCorrenteAdapterImpl()
	{
		presaCorrente = new PresaCorrente();
	}
	
	
	@Override
	public Corrente get120Volt() 
	{
		return getPresaCorrente().getCorrente();
	}

	@Override
	public Corrente get12Volt() 
	{
		Corrente c = getPresaCorrente().getCorrente();
		return converti(c, 10);
	}

	@Override
	public Corrente get3Volt() 
	{
		Corrente c = getPresaCorrente().getCorrente();
		return converti(c, 40);
	}

	private Corrente converti(Corrente v, int i) 
	{
		return new Corrente(v.getVolts()/i);
	}

	
	private PresaCorrente getPresaCorrente() 
	{
		return presaCorrente;
	}

}
