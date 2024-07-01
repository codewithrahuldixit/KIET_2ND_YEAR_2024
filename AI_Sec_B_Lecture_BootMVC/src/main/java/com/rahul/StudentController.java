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

	@GetMapping(path = { "/", "students" })
	public String indexPage(Model model) {
		List<Student> students = service.reteriveAll();

		model.addAttribute("list_of_students", students);
		return "index";

	}

	@GetMapping(path = { "/addNew" })
	public String newStudent(Model model) {
		Student student = new Student();

		model.addAttribute("student", student);
		return "addStudent";

	}

	@GetMapping("/students/{id}")
	public String getStudent(@PathVariable int id, Model model) {
		Student student = service.reteriveById(id);
		model.addAttribute("stu", student);
		return "demo";
	}

	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		service.removeById(id);
		return "redirect:/";
	}

	@GetMapping("/updateStudent/{id}")
	public String updateStudent(@PathVariable int id, Model model) {
		Student student = service.reteriveById(id);
		model.addAttribute("student", student);
		return "addStudent";
	}

	@PostMapping("/save")
	public String getStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/";
	}
}
