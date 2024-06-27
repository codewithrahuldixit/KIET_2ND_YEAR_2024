package com.rahul;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rahul.bean.Student;
import com.rahul.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository repository;
	private int id=100;

	public StudentService(StudentRepository repository) {
	
		this.repository = repository;
		repository.save(new Student(id++,"Rahul Dixit",9015088066l));
		repository.save(new Student(id++,"Shreya",9089898986l));
		repository.save(new Student(id++,"Vilakhshan",9015088066l));
		repository.save(new Student(id++,"Harsha",9015088066l));
	}

	public Student reteriveByID(int id2) {
		// TODO Auto-generated method stub
		return repository.findById(id2).get();
	}

	public List<Student> reteriveAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		repository.save(student);		
	}

	public void removeByid(int id2) {
		repository.deleteById(id2);		
	}

}
