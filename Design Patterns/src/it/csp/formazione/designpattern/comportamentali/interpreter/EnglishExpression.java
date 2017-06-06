package it.csp.formazione.designpattern.comportamentali.interpreter;

public class EnglishExpression implements Expression {

	@Override
	public String interpret(InterpreterNumberContext context) 
	{
		int number = context.getNumber();
		String result = "";
		switch (number)
		{
			case 1: { result = "one"; break; }
			case 2: { result = "two"; break; }
			case 3: { result = "three"; break; }
			case 4: { result = "four"; break; }
			case 5: { result = "five"; break; }
			case 6: { result = "six"; break; }
			case 7: { result = "seven"; break; }
			case 8: { result = "eigth"; break; }
			case 9: { result = "nine"; break; }
		}
		
		return result;
	}

}
