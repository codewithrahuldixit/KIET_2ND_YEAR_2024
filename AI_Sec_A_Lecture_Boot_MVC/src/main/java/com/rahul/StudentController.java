package com.rahul;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//@RestController
@Controller
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path = {"/","students"})
	public String getStudent(Model model) {
		model.addAttribute("list_of_students", service.reteriveAll());
		return "index";
	}
	@GetMapping("/students/{id}")
	public String getStudentById(@PathVariable int id,Model model ) {
		model.addAttribute("student", service.reteriveById(id));
		return "demo";
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
