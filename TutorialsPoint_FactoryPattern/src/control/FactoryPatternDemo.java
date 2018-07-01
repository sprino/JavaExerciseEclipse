package control;
import dao.Color;
import dao.Shape;
import factory.ColorFactory;
import factory.ShapeFactory;

public class FactoryPatternDemo {
	
	public static void main(String args[]) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("RECTANGLE");
		shape3.draw();
		
		ColorFactory colorFactory = new ColorFactory();
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
		Color color2 = colorFactory.getColor("GREEN");
		color2.fill();
		Color color3 = colorFactory.getColor("BLU");
		color3.fill();
	}
	
}
