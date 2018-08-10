package it.danven72.formazione.designpattern.strutturali.adapter.inheritance;

public class AdpterDemo {

	public static void main(String[] args) 
	{
		PresaCorrenteAdapterImpl adapter = new PresaCorrenteAdapterImpl();
		System.out.println("Volt attesi 120 - ricevuti: " + adapter.get120Volt().getVolts());
		System.out.println("Volt attesi 12 - ricevuti: " + adapter.get12Volt().getVolts());
		System.out.println("Volt attesi 3 - ricevuti: " + adapter.get3Volt().getVolts());
		
	}

}
