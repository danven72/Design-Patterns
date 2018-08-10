package it.danven72.formazione.designpattern.comportamentali.interpreter;

import it.danven72.formazione.designpattern.comportamentali.interpreter.InterpreterNumberExector.Language;

public class InterpreterDemo {

	public static void main(String[] args) 
	{
		InterpreterNumberExector interpreterClient = new InterpreterNumberExector();
		
		InterpreterNumberContext context = new InterpreterNumberContext();
		
		for (int i=1; i<10; i++)
		{	
			context.setNumber(i);
			System.out.print(i+" --> ENGLISH " + interpreterClient.interpret(context, Language.ENGLIGH)+"  ");
			System.out.println(" --> ITALIAN " + interpreterClient.interpret(context, Language.ITALIAN));
		}
		
	}

}
