package it.danven72.formazione.designpattern.comportamentali.observer;

public class Consumatore implements Observer 
{
	private Prodotto prodotto;
	private String nome;
	
	public Consumatore(String unNome)
	{
		nome = unNome;
	}
	
	public void setProdotto(Prodotto unProdotto)
	{
		prodotto = unProdotto;
		unProdotto.register(this);
	}
	
	@Override
	public void update() 
	{
		if(getProdotto().isInSaldo())
		{
			compra();
			cancellaSottoscrizione();
		}
	}

	public String getNome()
	{
		return nome;
	}
	
	private void compra()
	{
		System.out.println(getNome() + " ha Comprato "+getProdotto().getNome());
	}

	private void cancellaSottoscrizione()
	{
		getProdotto().unregister(this);
		System.out.println(getNome()+" non è più interessato a "+getProdotto().getNome());
	}
	
	private Prodotto getProdotto()
	{
		return prodotto;
	}

}
