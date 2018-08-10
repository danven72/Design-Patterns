package it.danven72.formazione.designpattern.comportamentali.interpreter;

public class ItalianExpression implements Expression {

	@Override
	public String interpret(InterpreterNumberContext context) 
	{
		int number = context.getNumber();
		String result = "";
		switch (number)
		{
			case 1: { result = "uno"; break; }
			case 2: { result = "due"; break; }
			case 3: { result = "tre"; break; }
			case 4: { result = "quattro"; break; }
			case 5: { result = "cinque"; break; }
			case 6: { result = "sei"; break; }
			case 7: { result = "sette"; break; }
			case 8: { result = "otto"; break; }
			case 9: { result = "nove"; break; }
		}
		
		return result;
	}

}
