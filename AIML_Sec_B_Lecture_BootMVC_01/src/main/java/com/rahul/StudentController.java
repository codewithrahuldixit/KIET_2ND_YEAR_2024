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

@Controller
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping(path = {"/","/students"})
	public String viewHomePage(Model mav) {
		List<Student> students =  service.retrieveAllStudents();
		mav.addAttribute("list_of_students", students);
		return "index";
	}
	@GetMapping("/addNew")
	public String addNewStudent(Model mav) {
		Student student = new Student();
		mav.addAttribute(student);
		return "addStudent";
	}
	@PostMapping("/save")
	public String createStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/";
	}
	
	
	
	
	@GetMapping("/student/{name}")
	public String getStudent(@PathVariable String name,Model mav) {
		Student student = new Student(101, name, 9015088066l);
		mav.addAttribute("stu",student);
	return "demo";
	}

	
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		service.removeStudent(id);
		return "redirect:/";
	}
	@GetMapping("/updateStudent/{id}")
	public String updateForm(@PathVariable(value = "id") int id,Model mav) {
		Student student = service.getById(id);
		mav.addAttribute("student",student);
		return "addNew";
	}

}
