package factory;
import dao.Color;
import dao.Shape;
import model.Circle;
import model.Rectangle;
import model.Square;

public class ShapeFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shapeType) {
		
		if(shapeType==null) {
			return null;
		}
	    if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		
		return null;
	}
	
	@Override
	public Color getColor(String colorType) {
		return null;
	}
}
