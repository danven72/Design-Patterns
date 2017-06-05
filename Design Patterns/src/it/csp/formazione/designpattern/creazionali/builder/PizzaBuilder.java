package it.csp.formazione.designpattern.creazionali.builder;
/**
 * Builder astratta del prodotto
 * @author ventura
 *
 */
public abstract class PizzaBuilder 
{
	protected Pizza pizza;
	
	public void createNewPizza()
	{
		pizza = new Pizza();
	}
	
	public Pizza getPizza()
	{
		return pizza;				
	}
	
	public abstract void buildImpasto();
	public abstract void buildSalsa();
	public abstract void buildIngredientiSopra();
}
