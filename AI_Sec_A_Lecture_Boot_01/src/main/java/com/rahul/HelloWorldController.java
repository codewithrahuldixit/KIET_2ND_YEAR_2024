package com.rahul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String helloWeb() {
		return "Hello This Is My First Web App";
	}
	@GetMapping("/student/{name}")
	public Student getStudent(@PathVariable String name) {
		return new Student(101,name,9015088066l);
	}
	@PostMapping("/student")
	public Student getStudent1(@RequestBody Student student) {
		return student;
	}
	

}
