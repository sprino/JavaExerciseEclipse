package model;

import dao.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.err.println("Inside Rectangle:draw().");
	}
}