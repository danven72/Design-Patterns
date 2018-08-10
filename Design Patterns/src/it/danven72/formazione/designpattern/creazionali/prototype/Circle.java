package it.danven72.formazione.designpattern.creazionali.prototype;

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
