package it.danven72.formazione.designpattern.comportamentali.command;

public class LightOffCommand implements Command {
	
	private Light light;
	
	public LightOffCommand(Light light)
	{
		this.light = light;
	}
	
	@Override
	public void execute() 
	{
		light.switchOff();
	}

}
