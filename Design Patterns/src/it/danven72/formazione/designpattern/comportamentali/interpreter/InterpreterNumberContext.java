package it.danven72.formazione.designpattern.comportamentali.interpreter;

public class InterpreterNumberContext 
{
	private int number;

	public int getNumber() 
	{
		return number;
	}

	public void setNumber(int number) 
	{
		if (number<1 || number > 10) 
			throw new IllegalArgumentException("Valore fuori dal contesto");
		this.number = number;
	}
	
	
}
