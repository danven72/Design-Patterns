package it.csp.formazione.designpattern.creazionali.builder;

public class QuattroStagioniPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildImpasto() 
	{
		pizza.setImpasto("4 cereali");
	}

	@Override
	public void buildSalsa() 
	{
		pizza.setSalsa("sugo rosso");
	}

	@Override
	public void buildIngredientiSopra() 
	{
		pizza.setIngredientiSopra("Mozzarella, Carciofini, prosciutto, Funghi");
	}

}
