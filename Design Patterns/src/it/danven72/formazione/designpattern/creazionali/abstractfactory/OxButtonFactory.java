package it.danven72.formazione.designpattern.creazionali.abstractfactory;

public class OxButtonFactory extends AbstractButtonFactory {

	@Override
	public Button createButton() 
	{
		return new WinButton();
	}

}
