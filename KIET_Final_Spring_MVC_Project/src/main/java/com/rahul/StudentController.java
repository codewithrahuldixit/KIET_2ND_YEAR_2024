package com.rahul;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//@RestController
@Controller
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping(path = { "/", "students" })
	public String getAllStudent(Model model) {
		List<Student> students = service.retireveAll();
		model.addAttribute("list_of_Students", students);
		return "index";
	}

	@GetMapping(path = { "/addNew" })
	public String addStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "addStudent";
	}

	@PostMapping(path = { "/save" })
	public String saveStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/";
	}

	@GetMapping("/students/{id}")
	public String getStudent(@PathVariable int id, Model model) {
		Student student = service.retireveById(id);
		model.addAttribute("stu", student);
		return "demo";
	}
	@GetMapping("/updateStudent/{id}")
	public String UpdateStudent(@PathVariable int id, Model model) {
		Student student = service.retireveById(id);
		model.addAttribute("student", student);
		return "addStudent";
	}

	@GetMapping("/deleteStudent/{id}")
	public String removeStudent(@PathVariable int id) {

		service.deleteStudent(id);
		return "redirect:/";
	}

}
