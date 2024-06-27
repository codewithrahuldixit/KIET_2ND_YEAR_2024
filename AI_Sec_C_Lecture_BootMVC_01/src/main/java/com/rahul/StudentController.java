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

	@GetMapping("/students/{id}")
	public String getStudent(@PathVariable int id,Model mav) {
	Student stud =  service.reteriveByID(id);
	mav.addAttribute("student",stud);
	return "demo";
	}

	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.removeByid(id);
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
