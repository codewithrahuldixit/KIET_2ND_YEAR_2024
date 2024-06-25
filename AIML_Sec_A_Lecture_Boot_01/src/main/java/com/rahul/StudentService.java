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

	public List<Student> retrieveAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
