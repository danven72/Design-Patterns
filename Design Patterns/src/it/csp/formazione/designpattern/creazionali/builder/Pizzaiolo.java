package it.csp.formazione.designpattern.creazionali.builder;

/**
 * Nel pattern rappresenta il Director. Sa come usare il builder
 * @author ventura
 *
 */
public class Pizzaiolo 
{
	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pizzaBuilder)
	{
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public Pizza getPizza()
	{
		return pizzaBuilder.getPizza();
	}
	
	public void buildPizza()
	{
		pizzaBuilder.createNewPizza();
		pizzaBuilder.buildImpasto();
		pizzaBuilder.buildSalsa();
		pizzaBuilder.buildIngredientiSopra();
	}
}
