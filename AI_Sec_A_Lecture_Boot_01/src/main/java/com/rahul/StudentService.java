package com.rahul;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
private StudentRepository repository;

public StudentService(StudentRepository repository) {
	super();
	this.repository = repository;
}

}
