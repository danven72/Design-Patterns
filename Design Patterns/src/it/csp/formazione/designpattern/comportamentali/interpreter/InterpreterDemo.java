package it.csp.formazione.designpattern.comportamentali.interpreter;

import it.csp.formazione.designpattern.comportamentali.interpreter.InterpreterNumberClient.Language;

public class InterpreterDemo {

	public static void main(String[] args) 
	{
		InterpreterNumberClient interpreterClient = new InterpreterNumberClient();
		
		InterpreterNumberContext context = new InterpreterNumberContext();
		
		for (int i=1; i<10; i++)
		{	
			context.setNumber(i);
			System.out.print(i+" --> ENGLISH " + interpreterClient.interpret(context, Language.ENGLIGH)+"  ");
			System.out.println(" --> ITALIAN " + interpreterClient.interpret(context, Language.ITALIAN));
		}
		
	}

}
