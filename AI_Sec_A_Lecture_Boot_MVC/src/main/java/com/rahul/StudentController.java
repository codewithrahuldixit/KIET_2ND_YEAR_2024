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
	
	@GetMapping(path = {"/","students"})
	public String getStudent(Model model) {
		model.addAttribute("list_of_students", service.reteriveAll());
		return "index";
	}
	@GetMapping(path = {"/addNew"})
	public String addNewStudent(Model model) {
		Student student = new Student(000000,"Please Enter Student Name",00000000000L);
		model.addAttribute("student",student);
		return "addStudent";
	}
	@PostMapping("/save")
	public String storeStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/";
	}
	@GetMapping("/updateStudent/{id}")
	public String updateStudent(@PathVariable int id,Model model) {
		Student student = service.reteriveById(id);
		model.addAttribute("student",student);
		return "addStudent";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String removeStudentById(@PathVariable int id ) {
		 service.deleteStudentById(id);
		 return "redirect:/";
	}
	
	
	
	
	
	
}
