package com.rahul.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDemo {

	@Bean("person")
	public String getName() 
	{
		return "Rahul";
	}
	@Bean
	public int getId() 
	{
		return 12345;
	}
}
