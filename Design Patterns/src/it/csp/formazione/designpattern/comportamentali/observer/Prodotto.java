package it.csp.formazione.designpattern.comportamentali.observer;

import java.util.ArrayList;
import java.util.List;

public class Prodotto implements Observable {

	private List<Observer> clientiList;
	private String nome;
	private boolean inSaldo;
	
	public Prodotto(String nome)
	{
		clientiList = new ArrayList<Observer>();
		this.nome = nome;
	}
	
	
	@Override
	public void register(Observer obj) 
	{
		getClientiList().add(obj);
	}

	@Override
	public void unregister(Observer obj) 
	{
		getClientiList().remove(obj);
	}

	@Override
	public void notifyObservers() 
	{
		//Copio l'ArrayList perchè la Observer.update() potrebbe comportare la unsubscribe e 
		//ridurre le dimensioni dell'ArrayList impedendo a tutti gli elementi di essere sottoscritti
		List<Observer> copyObserverList = new ArrayList<Observer>(getClientiList());
		for (Observer consumatore:  copyObserverList)
		{
			consumatore.update();
		}
	}

	public boolean isInSaldo() {
		return inSaldo;
	}

	public void setInSaldo(boolean aValue)
	{
		inSaldo = aValue;
		notifyObservers();
	}
	
	private List<Observer> getClientiList() {
		return clientiList;
	}

	public String getNome()
	{
		return nome;
	}
	
}
