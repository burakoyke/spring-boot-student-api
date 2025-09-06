package com.burakoyke.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.burakoyke.model.Student;
import com.burakoyke.services.StudentService;

@RestController
@RequestMapping("/rest/api/student")
public class RestStudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(path = "/list")
	public List<Student> getAllStudents() {
		
		return studentService.getAllStudents();
	}
	

}
