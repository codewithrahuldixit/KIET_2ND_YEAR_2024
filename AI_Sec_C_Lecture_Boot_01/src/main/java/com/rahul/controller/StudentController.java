package com.rahul.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.StudentService;
import com.rahul.bean.Student;

@RestController
public class StudentController {

	private StudentService service;
	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.reteriveByID(id);
	}
	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return service.reteriveAll();
	}
	@PostMapping("/student")
	public void getStudent(@RequestBody Student student) {
		service.saveStudent(student);
	}
}
