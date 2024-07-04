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
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping("/updateStudent/{id}")
	public String getStudent(@PathVariable int id,Model mav) {
	Student stud =  service.reteriveByID(id);
	mav.addAttribute("student",stud);
	return "addStudent";
	}

	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		service.removeByid(id);
		return "redirect:/";
	}

	@GetMapping(path = {"/","students"})
	public String getAllStudent(Model model) {		
		model.addAttribute("list_of_students", service.reteriveAll());
		//it Returns The HTML Page Name
		return "index";
	}
	@GetMapping(path = {"/addNew"})
	public String newStudent(Model model) {	
		Student student = new Student(0,"Enter Name",00000000l);
		model.addAttribute("student", student);
		//it Returns The HTML Page Name
		return "addStudent";
	}

	@PostMapping("/save")
	public String getStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/";
	}
}
