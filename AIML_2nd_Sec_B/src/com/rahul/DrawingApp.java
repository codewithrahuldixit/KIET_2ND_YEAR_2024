package com.rahul;

//Tight Coupling
public class DrawingApp {
	private Shape s;

	public DrawingApp(Shape s) {
		super();
		this.s = s;
	}

	public Shape getS() {
		return s;
	}

	public void setS(Shape s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "DrawingApp [s=" + s + "]";
	}

	public void draw() {
		System.out.println(s);
	}

}
