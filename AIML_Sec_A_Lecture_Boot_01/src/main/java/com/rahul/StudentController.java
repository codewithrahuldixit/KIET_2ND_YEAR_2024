package com.rahul;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
//Annotation which indicates that a method parameter should 
	// be bound to a URI templatevariable.
	// Supported for RequestMapping annotated handler methods.
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@DeleteMapping("/student/{id}")
	public void getStudent(@PathVariable int id) {
		service.deleteStudent(id);
	}
	
	
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return service.retrieveAll();
	}
	
	
	
	
	@PostMapping("/student")
	public void createStudent(@RequestBody Student student) {
		service.saveStudent(student);
	}

}
