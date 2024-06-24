package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.bean.Student;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
