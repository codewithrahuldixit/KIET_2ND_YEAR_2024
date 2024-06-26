package com.rahul;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private StudentRepository repo;

	public StudentService(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Student> retrieveAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
