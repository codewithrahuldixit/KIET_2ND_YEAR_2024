package com.rahul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String HelloDemo() {
		return "Hello This is My First Web Application";
	}
	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(101,"Rahul Dixit",9015088066l);
	}
}
