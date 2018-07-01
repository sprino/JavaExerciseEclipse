package model;

import dao.Color;

public class Blue implements Color{
	@Override
	public void fill() {
		System.out.println("Sono il blu.");
	}
}
