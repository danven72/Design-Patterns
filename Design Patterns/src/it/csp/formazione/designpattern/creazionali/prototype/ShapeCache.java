package it.csp.formazione.designpattern.creazionali.prototype;

import java.util.Hashtable;

public class ShapeCache 
{
	public enum ShapeID {SQUARE, RECTANGLE, CIRCLE};
	
	private Hashtable<ShapeID, Shape> shapeMap;
	
	public ShapeCache()
	{
		shapeMap = new Hashtable<ShapeID, Shape>();
		loadCache();
	}
	
	private void loadCache()
	{
		Square square = new Square();
		square.setId(ShapeID.SQUARE.toString());
		shapeMap.put(ShapeID.SQUARE, square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId(ShapeID.RECTANGLE.toString());
		shapeMap.put(ShapeID.RECTANGLE, rectangle);
		
		Circle circle = new Circle();
		circle.setId(ShapeID.CIRCLE.toString());
		shapeMap.put(ShapeID.CIRCLE, circle);
	}
	
	public Shape getShape(ShapeID shapeID)
	{
		Shape cachedShape = shapeMap.get(shapeID);
		
		return (Shape)cachedShape.clone();
	}
}
