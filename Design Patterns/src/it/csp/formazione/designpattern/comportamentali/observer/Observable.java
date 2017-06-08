package it.csp.formazione.designpattern.comportamentali.observer;

public interface Observable //Spesso nel pattern è denominato Subject 
{

	public void register(Observer obj);
	public void unregister(Observer obj);
	public void notifyObservers();
	
	
}
