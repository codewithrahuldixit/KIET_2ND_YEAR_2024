package com.rahul.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Circle implements Shape{
	private int radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Circle Object is Created");
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
