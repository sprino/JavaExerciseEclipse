package factory;

import dao.Color;
import dao.Shape;
import model.Blue;
import model.Green;
import model.Red;

public class ColorFactory extends AbstractFactory{
	
	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		if(colorType == null) {
			return null;
		}
		
		if(colorType.equalsIgnoreCase("RED")) {
			return new Red();
		}
		else if(colorType.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		else if(colorType.equalsIgnoreCase("BLU")) {
			return new Blue();
		}
		
		return null;
	}
}
