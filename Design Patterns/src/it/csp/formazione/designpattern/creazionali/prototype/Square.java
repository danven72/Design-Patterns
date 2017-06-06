package it.csp.formazione.designpattern.creazionali.prototype;

public class Square extends Shape {

	public Square(){
	     type = "Square";
	   }	
	
	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");

	}

}
