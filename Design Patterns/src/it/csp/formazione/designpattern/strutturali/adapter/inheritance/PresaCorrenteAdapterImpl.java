package it.csp.formazione.designpattern.strutturali.adapter.inheritance;

import it.csp.formazione.designpattern.strutturali.adapter.Corrente;
import it.csp.formazione.designpattern.strutturali.adapter.PresaCorrenteAdapter;
import it.csp.formazione.designpattern.strutturali.adapter.PresaCorrente;

public class PresaCorrenteAdapterImpl extends PresaCorrente implements PresaCorrenteAdapter 
{

	public PresaCorrenteAdapterImpl() 
	{
		super();
	}

	@Override
	public Corrente get120Volt() 
	{
		return getCorrente();
	}

	@Override
	public Corrente get12Volt() {
		Corrente c = getCorrente();
		return converti(c, 10);
	}

	@Override
	public Corrente get3Volt() {
		Corrente c = getCorrente();
		return converti(c, 40);
	}
	
	private Corrente converti(Corrente v, int i) 
	{
		return new Corrente(v.getVolts()/i);
	}

}
