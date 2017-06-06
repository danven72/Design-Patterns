package it.csp.formazione.designpattern.comportamentali.interpreter;

public class InterpreterNumberClient
{
	public enum Language {ENGLIGH, ITALIAN};
	
	private Expression englishExpression;
	private Expression italianExpression;
	
	public InterpreterNumberClient()
	{
		englishExpression = new EnglishExpression();
		italianExpression = new ItalianExpression();
	}
	
	public String interpret(InterpreterNumberContext aContext, Language language)
	{
		String result = "";
		if(Language.ENGLIGH.equals(language))
		{
			result = getEnglishExpression().interpret(aContext);
		}
		else if(Language.ITALIAN.equals(language))
		{
			result = getItalianExpression().interpret(aContext);
		}
		
		return result;
	}
	
	
	private Expression getEnglishExpression() {
		return englishExpression;
	}



	private Expression getItalianExpression() {
		return italianExpression;
	}



}
