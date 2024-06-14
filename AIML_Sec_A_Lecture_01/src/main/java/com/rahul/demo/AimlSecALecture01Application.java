package com.rahul.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class AimlSecALecture01Application {
/*
	@Bean("circle")
	public Circle getCircle() {
		return new Circle(4);
	}
	@Bean("rectangle")
	@Primary
	public Rectangle getRectangle() {
		return new Rectangle(3,5);
	}
	*/
	public static void main(String[] args) {
		//SpringApplication.run(AimlSecALecture01Application.class, args);
		var context = 
				new AnnotationConfigApplicationContext
				(AimlSecALecture01Application.class);
		//System.out.println(context.getBean("circle"));
		//System.out.println(context.getBean("rectangle"));
		//System.out.println(context.getBean(Circle.class));
		//System.out.println(context.getBean(Shape.class));
		DrawingApp d1 = context.getBean(DrawingApp.class);
		d1.draw();
	}

}
