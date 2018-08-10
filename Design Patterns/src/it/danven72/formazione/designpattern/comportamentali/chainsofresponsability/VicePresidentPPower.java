package it.danven72.formazione.designpattern.comportamentali.chainsofresponsability;

public class VicePresidentPPower extends PurchasePower {

    protected double getAllowable(){
        return BASE*40;
    }

    protected String getRole(){
        return "Vice President";
    }
}
