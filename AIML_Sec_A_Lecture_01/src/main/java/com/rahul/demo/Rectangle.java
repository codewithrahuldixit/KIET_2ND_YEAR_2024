package com.rahul.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Qualifier("rectangle")
@Lazy
public class Rectangle implements Shape{
	private int length;
	private int breath;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Rectangle Object is Created");
	}

	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + "]";
	}

}
