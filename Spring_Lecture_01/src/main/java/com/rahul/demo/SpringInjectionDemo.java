package com.rahul.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringInjectionDemo {
	
	@Bean("bean1")
	public String name() {
		return "Rahul";
	}
	@Bean
	public int getId() {
		return 12345;
	}
	@Bean("circle")
	public Circle getCircle() {
		return new Circle(40);
	}
	@Bean("rectangle")
	public Rectangle getRectangle() {
		return new Rectangle(10,20);
	}

}
