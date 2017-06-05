package it.csp.formazione.designpattern.comportamentali.command;

public class RemoteControl {
	
	public void pressButton(Command aCommand)
	{
		aCommand.execute();
	}

}
