package com.rahul;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private static int id=200;
	private StudentRepository repo;

	public StudentService(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Student> retrieveAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public void saveStudent(Student student) {
		student.setId(++id);
		repo.save(student);
		System.out.println(student);
	}

	public void removeStudent(int id) {
		repo.deleteById(id);
		
	}

	public Student getById(int id2) {
		
		return repo.findById(id2).get();
	}

}
