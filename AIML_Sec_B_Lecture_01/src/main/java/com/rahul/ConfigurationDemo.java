package com.rahul;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDemo {

	@Bean
	public String getName() {
		return "Rahul Kumar Dixit";
	}
	
	@Bean
	public int getId() {
		return 12345;
	}
}
