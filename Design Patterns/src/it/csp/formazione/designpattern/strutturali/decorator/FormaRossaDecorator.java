package it.csp.formazione.designpattern.strutturali.decorator;

public class FormaRossaDecorator extends FormaDecorator 
{
	public FormaRossaDecorator(Forma formaDaDecorare) 
	{
		super(formaDaDecorare);
	
	}

	@Override
	public void disegna() 
	{
		setColore();
		super.disegna();
	}
	
	private void setColore()
	{
		System.out.print("Colore: rosso; ");
	}

}
