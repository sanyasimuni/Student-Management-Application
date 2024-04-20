package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.model.Student;
import com.student.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	//find all student 
	
	@GetMapping("/students")
	
	public String ListofStudent(Model model) {
		
		    model.addAttribute("student",service.listofStudent());
		    
		    return "students";
	}
	
	//create save
	
	@GetMapping("/students/new")
	public String createRegistration(Model model) {
		
		Student student=new Student();
		model.addAttribute("student",student);
		
		
		return "create_student";
	}
	
	//save student
	@PostMapping("/students")
	public String SaveStudent(@ModelAttribute("student") Student student) {
		
		           service.saveStudent(student);
		           return "redirect:/students";
		
	}
	
	//edit student
	
	@GetMapping("/students/edit/{id}")
	public String EditStudent(@PathVariable int id,Model model) {
		 
		     model.addAttribute("student",service.singleStudent(id));
		     
		     return "edit_student";
		     
	}
	
	//Update Student
	@PostMapping("/students/{id}")
	public String UpdateStudent(@ModelAttribute Student student,@PathVariable int id,Model model) {
		
		                   Student st=service.singleStudent(id);
		                   st.setId(id);
		                   st.setName(student.getName());
		                   st.setEmail(student.getEmail());
		                   st.setPhoneNo(student.getPhoneNo());
		                   
		                   service.updateStudent(st);
		                   
		
		
		return "redirect:/students";
		
	}

	//delete
	
	@GetMapping("/students/{id}")
	public String deletestudent(@PathVariable int id) {
		      service.deleteStudent(id);
		      return "redirect:/students";
		
	}
}
