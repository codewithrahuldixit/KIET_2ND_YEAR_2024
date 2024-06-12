package com.rahul.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class AiSecBLecture01Application {

	public static void main(String[] args) {
		//SpringApplication.run(AiSecBLecture01Application.class, args);
		var context = 
				new AnnotationConfigApplicationContext
				(ConfigurationDemo.class);
		System.out.println(context.getBean("name"));
	}

}
