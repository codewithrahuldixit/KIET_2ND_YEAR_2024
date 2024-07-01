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

/*Annotation which indicates that a method parameter should be bound to a 
 * URI templatevariable. Supported for RequestMapping annotated handler 
 * methods. */
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
		Student student = service.reteriveById(id);
		model.addAttribute("stu",student);
		return "demo";
	}

	@GetMapping("/students")
	public List<Student> getStudent() {
		return service.reteriveAll();
	}

	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.removeById(id);
	}

	@PostMapping("/student")
	public void getStudent(@RequestBody Student student) {
		 service.saveStudent(student);
	}
}
