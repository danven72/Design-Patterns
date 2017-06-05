package it.csp.formazione.designpattern.comportamentali.command;

public class CommandPatternDemo {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		Light light = new Light();
		Command lightOnCommand = new LightOnCommand(light);
		Command lightOffCommand = new LightOffCommand(light);
		
		rc.pressButton(lightOnCommand);
		System.out.println("LightOn: "+light.isOn());
		
		rc.pressButton(lightOffCommand);
		System.out.println("LightOn: "+light.isOn());

	}

}
