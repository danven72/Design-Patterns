package it.danven72.formazione.designpattern.strutturali.adapter;

public class Corrente 
{
	private int volts;
	
	public Corrente(int volts)
	{
		setVolts(volts);
	}
	
	public int getVolts() {
		return volts;
	}

	private void setVolts(int volts) {
		this.volts = volts;
	}
	
	
}
