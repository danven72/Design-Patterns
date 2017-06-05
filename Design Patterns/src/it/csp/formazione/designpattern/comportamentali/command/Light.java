package it.csp.formazione.designpattern.comportamentali.command;

public class Light {
	private boolean on;
	
	public void switchOn()
	{
		setOn(true);
	}
	
	public void switchOff()
	{
		setOn(false);
	}

	public boolean isOn() {
		return on;
	}

	private void setOn(boolean on) {
		this.on = on;
	}
	
	
}
