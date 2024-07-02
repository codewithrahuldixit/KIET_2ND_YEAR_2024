package com.rahul;

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


}
