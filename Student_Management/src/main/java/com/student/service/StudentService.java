package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {
	
	//list of
	     List<Student> listofStudent();
	     
	     //get single
	     Student singleStudent(int id);
	     
	     //save Student
	     Student saveStudent(Student student);
	     
	     //update Student
	     
	     Student updateStudent(Student student);
	     
	     //delete Student
	     
	     void deleteStudent(int id);
	     
	     
	     

}
