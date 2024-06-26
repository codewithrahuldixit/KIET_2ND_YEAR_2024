package com.rahul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*Annotation which indicates that a method parameter should be bound to a 
 * URI templatevariable. Supported for RequestMapping annotated handler 
 * methods. */
@RestController
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping("/student/{name}")
	public Student getStudent(@PathVariable String name) {
		return new Student(101, name, 9015088066l);
	}

	@PostMapping("/student")
	public Student getStudent(@RequestBody Student student) {
		return student;
	}
}
