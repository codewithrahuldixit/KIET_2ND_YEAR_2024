package com.rahul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String helloWorld() {
		return "This is My First Rest API";
	}
	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(101,"Rahul Dixit",9015088066l);
	}
}
