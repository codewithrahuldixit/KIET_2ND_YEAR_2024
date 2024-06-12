package com.rahul.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDemo {

	@Bean("name")
	public String getName() {
		return "Rahul Kumar Dixit";
	}
	@Bean
	public int getId() {
		return 12345;
	}
}
