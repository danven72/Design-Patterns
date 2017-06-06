package it.csp.formazione.designpattern.comportamentali.chainsofresponsability;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChainsOfResponsabilityDemo 
{
	public static void main(String[] args) 
	{
		AuthorityChecker authorityChecker = new AuthorityChecker();
		try 
		{
            while (true) 
            {
                System.out.println("Enter the amount to check who should approve your expenditure.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                PurchaseRequest purchaseRequest = new PurchaseRequest(d, "General");
                authorityChecker.checkPurchaseRequest(purchaseRequest);
           }
        } 
		catch(Exception e) 
		{
            System.exit(1);
        }

	}
}
