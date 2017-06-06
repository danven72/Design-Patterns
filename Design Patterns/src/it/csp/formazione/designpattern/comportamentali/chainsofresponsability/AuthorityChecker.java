package it.csp.formazione.designpattern.comportamentali.chainsofresponsability;

public class AuthorityChecker 
{
	private PurchasePower gerarchyPurchasePower;
	
	public AuthorityChecker()
	{
		gerarchyPurchasePower = buildGerarchy();
	}
	
	private static PurchasePower buildGerarchy()
	{
		ManagerPPower managerPower = new ManagerPPower();
        DirectorPPower director = new DirectorPPower();
        VicePresidentPPower vicePresident = new VicePresidentPPower();
        PresidentPPower president = new PresidentPPower();
        
        managerPower.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        
        return managerPower;
	}
	
	
	private PurchasePower getGerarchyPurchasePower()
	{
		return gerarchyPurchasePower;
	}
	
	public void checkPurchaseRequest(PurchaseRequest purchaseRequest)
	{
		getGerarchyPurchasePower().processRequest(purchaseRequest);
	}
	
}
