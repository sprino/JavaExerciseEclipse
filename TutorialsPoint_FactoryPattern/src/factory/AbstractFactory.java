package factory;
import dao.Color;
import dao.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String colorType);
	abstract Shape getShape(String shapeType);
}
