package com.rahul;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private StudentRepository repository;

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
	}

	public Student reteriveById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public List<Student> reteriveAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public void removeById(int id) {
		repository.deleteById(id);
		
	}

	public void saveStudent(Student student) {
		repository.save(student);
		
	}

}
