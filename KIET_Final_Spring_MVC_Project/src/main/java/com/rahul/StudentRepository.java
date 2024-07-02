package com.rahul;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
@Repository
@Transactional
//Imlicitly the Hibernate ORM Tool is Providing the Implementation to JPA Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
