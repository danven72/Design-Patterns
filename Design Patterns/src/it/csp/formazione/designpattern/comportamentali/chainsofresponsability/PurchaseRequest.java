package it.csp.formazione.designpattern.comportamentali.chainsofresponsability;

/**
 * 
 * @author ventura
 * Rappresenta la richiesta che dovra'  essere gestita dalla opportuna implementazione di PurchasePower
 */
public class PurchaseRequest 
{
	private double amount;
    private String purpose;

    public PurchaseRequest(double amount, String purpose) 
    {
        this.amount = amount;
        this.purpose = purpose;
    }

    public double getAmount() 
    {
        return amount;
    }
    
    public void setAmount(double amt)  
    {
        amount = amt;
    }

    public String getPurpose() 
    {
        return purpose;
    }
    
    public void setPurpose(String reason) 
    {
        purpose = reason;
    }

}
