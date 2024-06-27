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
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return service.retrieveAllStudents();
	}
	
	
	@GetMapping("/student/{name}")
	public Student getStudent(@PathVariable String name) {
		return new Student(101, name, 9015088066l);
	}

	@PostMapping("/student")
	public void createStudent(@RequestBody Student student) {
		service.saveStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.removeStudent(id);
	}
}