package it.danven72.formazione.designpattern.creazionali.builder;

/**
 * Nel pattern ha il ruolo del prodotto da costruire
 * @author ventura
 *
 */
public class Pizza 
{
	private String impasto;
	private String salsa;
	private String ingredientiSopra;
	
	public Pizza(){}

	public String getImpasto() {
		return impasto;
	}

	public void setImpasto(String impasto) {
		this.impasto = impasto;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	public String getIngredientiSopra() {
		return ingredientiSopra;
	}

	public void setIngredientiSopra(String ingredientiSopra) {
		this.ingredientiSopra = ingredientiSopra;
	}

	@Override
	public String toString() {
		return "Pizza [impasto=" + impasto + ", salsa=" + salsa + ", ingredientiSopra=" + ingredientiSopra + "]";
	}
	
	
}
