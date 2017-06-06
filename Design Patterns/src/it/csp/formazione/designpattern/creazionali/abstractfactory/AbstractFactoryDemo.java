package it.csp.formazione.designpattern.creazionali.abstractfactory;

public class AbstractFactoryDemo 
{
	public static void main(String[] args) 
	{
		AbstractButtonFactory factory = AbstractButtonFactory.getFactory();
		Button button = factory.createButton();
		button.paint();
	}
}
