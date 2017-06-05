package it.csp.formazione.designpattern.comportamentali.chainsofresponsability;

public class DirectorPPower extends PurchasePower {

    protected double getAllowable(){
        return BASE*20;
    }

    protected String getRole(){
        return "Director";
    }
}
