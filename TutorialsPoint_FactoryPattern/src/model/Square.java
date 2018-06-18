package model;

import dao.Shape;

public class Square implements Shape{
	@Override
	public void draw() {
		System.err.println("Inside Square:draw()");
	}
}
