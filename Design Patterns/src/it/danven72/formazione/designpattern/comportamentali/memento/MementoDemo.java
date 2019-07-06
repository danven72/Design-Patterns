package it.danven72.formazione.designpattern.comportamentali.memento;

public class MementoDemo {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
        
		Originator originator = new Originator();
        originator.setState("State1");
        caretaker.addMemento( originator.save() );
        originator.setState("State2");
        caretaker.addMemento( originator.save() );
        originator.setState("State3");
        caretaker.addMemento( originator.save() );
        originator.setState("State4");
        
        originator.restore( caretaker.getMemento() );

	}

}
