package com.rahul.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringLecture01Application {
	public static void main(String[] args) {
		//SpringApplication.run(SpringLecture01Application.class, args);
	var context = 
			new AnnotationConfigApplicationContext(SpringLecture01Application.class);
	//System.out.println(context.getBean("bean1"));
	System.out.println(context.getBean(Circle.class).hashCode());
	System.out.println(context.getBean(Circle.class).hashCode());
	System.out.println(context.getBean(Circle.class).hashCode());
	System.out.println(context.getBean(Circle.class).hashCode());
	System.out.println(context.getBean(Circle.class).hashCode());
	DrawingApp d1 = context.getBean(DrawingApp.class);
	d1.draw();
	}

}
