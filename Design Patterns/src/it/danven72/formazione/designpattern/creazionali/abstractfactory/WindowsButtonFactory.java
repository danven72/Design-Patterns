package it.danven72.formazione.designpattern.creazionali.abstractfactory;

public class WindowsButtonFactory extends AbstractButtonFactory {

	@Override
	public Button createButton() 
	{
		return new OxButton();
	}

}
