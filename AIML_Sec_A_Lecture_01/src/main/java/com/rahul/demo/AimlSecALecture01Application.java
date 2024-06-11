package com.rahul.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class AimlSecALecture01Application {

	public static void main(String[] args) {
		//SpringApplication.run(AimlSecALecture01Application.class, args);
		var context = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
		System.out.println(context.getBean("circle"));
		System.out.println(context.getBean("rectangle"));
		System.out.println(context.getBean(Circle.class));
		System.out.println(context.getBean(Shape.class));
	}

}
