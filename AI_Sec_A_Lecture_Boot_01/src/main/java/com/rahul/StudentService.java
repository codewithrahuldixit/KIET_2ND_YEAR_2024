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

	public List<Student> reteriveAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Student reteriveById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		repository.save(student);
	}

	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

}
