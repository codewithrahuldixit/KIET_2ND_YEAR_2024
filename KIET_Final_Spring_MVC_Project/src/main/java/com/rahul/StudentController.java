package com.rahul;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@RestController
@Controller
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/students/{id}")
	public String getStudent(@PathVariable int id,Model model) {
		Student student = service.retireveById(id);
		model.addAttribute("stu",student);
		return "demo";
	}
	
}
