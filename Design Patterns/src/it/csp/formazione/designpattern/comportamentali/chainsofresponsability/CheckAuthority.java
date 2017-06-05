package it.csp.formazione.designpattern.comportamentali.chainsofresponsability;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckAuthority 
{
	/**
	 * Viene assemblata la catena di responsabilità
	 * @return
	 */
	private static PurchasePower buildGerarchy()
	{
		ManagerPPower manager = new ManagerPPower();
        DirectorPPower director = new DirectorPPower();
        VicePresidentPPower vicePresident = new VicePresidentPPower();
        PresidentPPower president = new PresidentPPower();
        
        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        
        return manager;
	}
	
	public static void main(String[] args) 
	{
		PurchasePower pp = buildGerarchy();
		try {
            while (true) {
                System.out.println("Enter the amount to check who should approve your expenditure.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                pp.processRequest(new PurchaseRequest(d, "General"));
           }
        } catch(Exception e) {
            System.exit(1);
        }
	}
}
