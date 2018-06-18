package model;

import dao.Color;

public class Green implements Color{
	@Override
	public void fill() {
		System.out.println("Sono il verde.");
	}

}
