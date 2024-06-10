package com.rahul;

public class DrawingApp {
	private Shape shape;

	public DrawingApp(Shape shape) {
		super();
		this.shape = shape;
	}

	void print() {
		System.out.println(shape);
	}
}
