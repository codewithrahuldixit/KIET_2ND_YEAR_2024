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
	public List<Student> getStudent() {
		return service.reteriveAll();
	}
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id ) {
		return service.reteriveById(id);
	}
	@PostMapping("/student")
	public void storeStudent(@RequestBody Student student) {
		service.saveStudent(student);
	}
	@DeleteMapping("/students/{id}")
	public void removeStudentById(@PathVariable int id ) {
		 service.deleteStudentById(id);
	}
	
	
	
	
	
	
}
