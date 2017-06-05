package it.csp.formazione.designpattern.creazionali.builder;

public class CampagnolaPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildImpasto() 
	{
		pizza.setImpasto("Normale");

	}

	@Override
	public void buildSalsa() 
	{
		pizza.setSalsa("Bianca");

	}

	@Override
	public void buildIngredientiSopra() 
	{
		pizza.setIngredientiSopra("Patate, Salsiccia, Mozzarella");

	}

}
