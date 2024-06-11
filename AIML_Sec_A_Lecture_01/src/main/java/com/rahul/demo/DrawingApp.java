package com.rahul.demo;

public class DrawingApp {
	private Shape s;
	
	public DrawingApp(Shape s) {
		super();
		this.s = s;
	}

	public void draw() {
		System.out.println(s);
	}
}
