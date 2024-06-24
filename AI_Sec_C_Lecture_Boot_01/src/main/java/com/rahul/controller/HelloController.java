package com.rahul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.bean.Student;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "This is My First Web Aplication";
	}
	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(101,"Rahul Dixit",9015088066l);
	}
}
