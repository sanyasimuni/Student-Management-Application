package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.model.Student;


public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
