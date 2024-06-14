package com.rahul;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@SpringBootApplication
@Configuration
@ComponentScan
public class AimlSecBLecture01Application {
	/*@Bean("circle")
	public Circle getCircle() {
		return new Circle(5);
	}
	@Bean("rectangle")
	@Primary
	public Rectangle getRectangle() {
		return  new Rectangle(4,6);
	}*/	
	public static void main(String[] args) {
		//SpringApplication.run(AimlSecBLecture01Application.class, args);
	var context = 
			new AnnotationConfigApplicationContext
			(AimlSecBLecture01Application.class);
	//System.out.println(context.getBean("circle"));
	//System.out.println(context.getBean(Rectangle.class));
	//System.out.println(context.getBean(Shape.class));
	DrawingApp d=  context.getBean(DrawingApp.class);
	d.draw();
	}

}
