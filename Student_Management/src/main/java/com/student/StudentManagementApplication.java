package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.model.Student;
import com.student.repo.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication  implements CommandLineRunner{
	
	@Autowired
	private StudentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student student=new Student("Sanyasi","sanyasi@gmail.com","9178161049");
		repo.save(student);
		
	}

	
}
