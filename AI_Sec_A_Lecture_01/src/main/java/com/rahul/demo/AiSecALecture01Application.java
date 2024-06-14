package com.rahul.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class AiSecALecture01Application {
	
	/*@Bean
	public Circle getCircle() {
		return new Circle(4);
	}
	@Bean
	@Primary
	public Rectangle getRectangle() {
		return new Rectangle(4,5);
	}	*/
	public static void main(String[] args) {
		var context = 
			new AnnotationConfigApplicationContext
			(AiSecALecture01Application.class);
	
	//System.out.println(context.getBean("circle"));
	//System.out.println(context.getBean(Rectangle.class));
	//System.out.println(context.getBean(Shape.class));
		DrawingApp d1 = context.getBean(DrawingApp.class);
		d1.draw();
	
	}

}
