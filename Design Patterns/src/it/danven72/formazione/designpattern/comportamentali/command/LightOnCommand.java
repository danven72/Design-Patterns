package it.danven72.formazione.designpattern.comportamentali.command;

public class LightOnCommand implements Command {
	
	private Light light;
	
	public LightOnCommand(Light light)
	{
		this.light = light;
	}
	
	@Override
	public void execute() 
	{
		light.switchOn();
	}

}
