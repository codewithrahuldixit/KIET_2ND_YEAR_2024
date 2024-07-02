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

	public Student retireveById(int id) {
		return repository.findById(id).get();
	}

	public List<Student> retireveAll() {

		return repository.findAll();
	}

	public void saveStudent(Student student) {
		repository.save(student);

	}

	public void deleteStudent(int id) {
		repository.deleteById(id);

	}

}
