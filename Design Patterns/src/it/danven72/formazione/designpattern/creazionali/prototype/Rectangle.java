package it.danven72.formazione.designpattern.creazionali.prototype;

public class Rectangle extends Shape {
	 
	public Rectangle(){
	     type = "Rectangle";
	   }
	
	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");

	}

}
