package com.rahul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DrawingApp {
	@Autowired
	@Qualifier("rectangle") 
	private Shape shape;

	public DrawingApp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DrawingApp(Shape shape) {
		super();
		this.shape = shape;
	}

	//@Autowired
	public void setShape(Shape shape) {
		System.out.println("Setter Injection Done");
		this.shape = shape;
	}

	void print() {
		System.out.println(shape);
	}
}
