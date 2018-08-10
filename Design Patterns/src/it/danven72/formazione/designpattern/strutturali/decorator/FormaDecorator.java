package it.danven72.formazione.designpattern.strutturali.decorator;

public abstract class FormaDecorator implements Forma 
{
	protected Forma formaDaDecorare;
	
	protected FormaDecorator(Forma formaDaDecorare)
	{
		this.formaDaDecorare = formaDaDecorare;
	}
	
	@Override
	public void disegna() 
	{
		getFormaDaDecorare().disegna();
	}
	
	protected Forma getFormaDaDecorare()
	{
		return formaDaDecorare;
	}

}
