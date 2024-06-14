package com.rahul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DrawingApp {
	@Autowired
	@Qualifier("rectangle")
	private Shape s;
	/*
	public DrawingApp(Shape s) {
		super();
		this.s = s;
	}
*/
	public void draw() {
		System.out.println(s);
	}/*
	@Autowired
	public void setS(Shape s) {
		this.s = s;
	}*/
}
