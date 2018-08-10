package it.csp.formazione.designpattern.comportamentali.mediaor;

public class MediatorDemo {

	public static void main(String[] args) {
		ITOperationMediator operationMediator = new OperationMediator();

		System.out.println("Somma e sottrai: 15, 20, 5 - Result: "+operationMediator.sommaESottrai(15, 20, 5));
		System.out.println("Moltiplica e sottrai: 15, 20, 5 - Result: "+operationMediator.moltiplicaESottrai(15, 20, 5));
		System.out.println("Moltiplica e dividi: 15, 20, 5 - Result: "+operationMediator.moltiplicaEDividi(15, 20, 5));
	}

}
