package com.rahul;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle= new Circle(10);
		Rectangle r = new Rectangle(10,20);
		//The constructor DrawingApp(Rectangle) is undefined
		DrawingApp d1 = new DrawingApp(r);
		d1.draw();
	}

}
