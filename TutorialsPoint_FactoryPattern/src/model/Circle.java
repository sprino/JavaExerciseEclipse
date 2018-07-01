package model;

import dao.Shape;

public class Circle implements Shape{
	@Override
	public void draw() {
		System.err.println("Inner circle:draw()");
	}
}
