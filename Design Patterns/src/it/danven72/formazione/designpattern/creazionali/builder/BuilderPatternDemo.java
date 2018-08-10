package it.danven72.formazione.designpattern.creazionali.builder;

public class BuilderPatternDemo 
{
	public static void main(String[] args) 
	{
		Pizzaiolo pizzaiolo = new Pizzaiolo();
		pizzaiolo.setPizzaBuilder(new QuattroStagioniPizzaBuilder());
		
		pizzaiolo.buildPizza();
		System.out.println(pizzaiolo.getPizza());

		pizzaiolo.setPizzaBuilder(new CampagnolaPizzaBuilder());
		pizzaiolo.buildPizza();
		System.out.println(pizzaiolo.getPizza());
		
		
	}
}
