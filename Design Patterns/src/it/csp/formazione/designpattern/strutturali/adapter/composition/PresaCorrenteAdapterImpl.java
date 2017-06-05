package it.csp.formazione.designpattern.strutturali.adapter.composition;

import it.csp.formazione.designpattern.strutturali.adapter.Corrente;
import it.csp.formazione.designpattern.strutturali.adapter.PresaCorrenteAdapter;
import it.csp.formazione.designpattern.strutturali.adapter.PresaElettrica;

public class PresaCorrenteAdapterImpl implements PresaCorrenteAdapter {

	private PresaElettrica presaElettrica;
	
	public PresaCorrenteAdapterImpl()
	{
		presaElettrica = new PresaElettrica();
	}
	
	
	@Override
	public Corrente get120Volt() 
	{
		return presaElettrica.getCorrente();
	}

	@Override
	public Corrente get12Volt() 
	{
		Corrente c = presaElettrica.getCorrente();
		return converti(c, 10);
	}

	@Override
	public Corrente get3Volt() 
	{
		Corrente c = presaElettrica.getCorrente();
		return converti(c, 40);
	}

	private Corrente converti(Corrente v, int i) 
	{
		return new Corrente(v.getVolts()/i);
	}

	
	private PresaElettrica getPresaElettrica() 
	{
		return presaElettrica;
	}

}
