package com.rahul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DrawingApp {
	@Autowired
	@Qualifier("circle")
	private Shape shape;

	public void draw() {
		System.out.println(shape);
	}
}
