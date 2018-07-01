package model;

import dao.Color;

public class Red implements Color {
	@Override
	public void fill() {
		System.out.println("Sono il Rosso.");
	}
}
