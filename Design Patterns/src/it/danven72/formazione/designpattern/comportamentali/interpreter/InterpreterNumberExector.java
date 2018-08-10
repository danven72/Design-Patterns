package it.danven72.formazione.designpattern.comportamentali.interpreter;

import java.util.HashMap;
import java.util.Map;

public class InterpreterNumberExector
{
	public enum Language {ENGLIGH, ITALIAN};
	
	private Map <Language, Expression> expressionMap;
	
	public InterpreterNumberExector()
	{
		Expression englishExpression = new EnglishExpression();
		Expression italianExpression = new ItalianExpression();
		
		setExpressionMap(new HashMap<Language, Expression>());
		getExpressionMap().put(Language.ENGLIGH, englishExpression);
		getExpressionMap().put(Language.ITALIAN, italianExpression);
	}
	
	public String interpret(InterpreterNumberContext aContext, Language language)
	{
		String result = "";
		result = getExpressionMap().get(language).interpret(aContext);
		return result;
	}

	private Map <Language, Expression> getExpressionMap() {
		return expressionMap;
	}

	private void setExpressionMap(Map <Language, Expression> expressionMap) {
		this.expressionMap = expressionMap;
	}
	
	

}
