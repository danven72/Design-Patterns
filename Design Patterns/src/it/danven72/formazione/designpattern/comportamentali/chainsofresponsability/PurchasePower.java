package it.danven72.formazione.designpattern.comportamentali.chainsofresponsability;

/**
 * 
 * @author ventura
 * Questa classe rappresenta nel pattern l'handler: contiene cioè la logica
 * di business in grado di processare la richiesta
 */
public abstract class PurchasePower 
{
    protected static final double BASE = 500;
    protected PurchasePower successor;

    abstract protected double getAllowable();
    abstract protected String getRole();

    /**
     * Permette di impostare il successore della catena
     * @param successor
     */
    public void setSuccessor(PurchasePower successor) 
    {
        this.successor = successor;
    }

    public void processRequest(PurchaseRequest request)
    {
        if (request.getAmount() < this.getAllowable()) 
        {
            System.out.println(this.getRole() + " will approve $" + request.getAmount());
        } 
        else if (successor != null) 
        {
            successor.processRequest(request);
        }
    }
}
