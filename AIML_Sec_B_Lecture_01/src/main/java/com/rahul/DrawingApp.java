package com.rahul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Tight Coupling
@Component
public class DrawingApp {
	@Autowired
	@Qualifier("circle")
	private Shape s;
/*
	public DrawingApp(Shape s) {
		super();
		this.s = s;
	}
*/
	public Shape getS() {
		return s;
	}

	//@Autowired
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
