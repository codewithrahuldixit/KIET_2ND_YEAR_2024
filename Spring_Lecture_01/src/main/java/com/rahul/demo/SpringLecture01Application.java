package com.rahul.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringLecture01Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringLecture01Application.class, args);
	var context = 
			new AnnotationConfigApplicationContext(SpringInjectionDemo.class);
	System.out.println(context.getBean("bean1"));
	Shape shape = (Shape) context.getBean("circle");
	System.out.println(shape);
	}

}
