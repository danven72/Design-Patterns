package it.csp.formazione.designpattern.comportamentali.chainsofresponsability;

public class ManagerPPower extends PurchasePower
{	
	protected double getAllowable()
	{
		return BASE*10;
	}

    protected String getRole()
    {
        return "Manager";
    }
}
