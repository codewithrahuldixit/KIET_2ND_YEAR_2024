package com.rahul;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@RestController
@Controller
public class StudentController {
//Annotation which indicates that a method parameter should 
	// be bound to a URI templatevariable.
	// Supported for RequestMapping annotated handler methods.
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	
	@GetMapping("/deleteStudent/{id}")
	public String getStudent(@PathVariable int id) {
		service.deleteStudent(id);
		return "redirect:/";
	}
	

	@GetMapping("/addNew")
	public String newStudent(Model model) {
		Student stu = new Student();
		model.addAttribute("student", stu);
		return "addStudent";
	}
	@GetMapping("/updateStudent/{id}")
	public String newStudent(@PathVariable int id,Model model) {
		Student stu = service.reteriveById(id);
		model.addAttribute("student", stu);
		return "addStudent";
	}
	
	@GetMapping(path = {"/","students"})
	public String getAllStudents(Model model) {
		model.addAttribute("list_of_students",  service.retrieveAll());
		return "index";
	}
	
	
	
	
	@PostMapping("/save")
	public String createStudent(@ModelAttribute Student student) {
		service.saveStudent(student);
		return "redirect:/";
	}

}
