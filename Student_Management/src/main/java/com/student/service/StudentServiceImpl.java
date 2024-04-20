package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	@Autowired
	private StudentRepository repo;
	

	

	@Override
	public Student singleStudent(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public Student saveStudent(Student student) {
	       
		return  repo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return repo.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		
		repo.deleteById(id);
		
	}

	@Override
	public List<Student> listofStudent() {
		
		return repo.findAll();
	}

	
}
