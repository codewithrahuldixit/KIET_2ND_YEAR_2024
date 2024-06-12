package com.rahul;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class AimlSecBLecture01Application {

	public static void main(String[] args) {
		//SpringApplication.run(AimlSecBLecture01Application.class, args);
	var context = 
			new AnnotationConfigApplicationContext
			(ConfigurationDemo.class);
	System.out.println(context.getBean("getName"));
	}

}
