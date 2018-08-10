package it.danven72.formazione.designpattern.creazionali.prototype;

public class PrototypeDemo {

	public static void main(String[] args) 
	{
		ShapeCache shapeCache = new ShapeCache();
		Shape clonedShape1 = shapeCache.getShape(ShapeCache.ShapeID.RECTANGLE);
		System.out.println("Shape : " + clonedShape1.getType());
		
		Shape clonedShape2 = shapeCache.getShape(ShapeCache.ShapeID.SQUARE);
		System.out.println("Shape : " + clonedShape2.getType());
		
		Shape clonedShape3 = shapeCache.getShape(ShapeCache.ShapeID.CIRCLE);
		System.out.println("Shape : " + clonedShape3.getType());


	}

}
