package com.rahul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DrawingApp {
	@Autowired
	@Qualifier("rect")
	private Shape shape;
	/*
	 * public DrawingApp(Shape shape) { super(); this.shape = shape; }
	 */

	public void draw() {
		System.out.println(shape);
	}
	/*
	 * @Autowired public void setShape(Shape shape) { this.shape = shape; }
	 */
}
