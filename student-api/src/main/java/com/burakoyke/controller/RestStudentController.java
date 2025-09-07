package com.burakoyke.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping(path = "/list/id/{id}")
	public Student getStudentById(@PathVariable(name = "id",required = true) int id) {
		
		return studentService.getStudentById(id);
	}
	
	@GetMapping(path = "/list/name/{studentName}")
	public List<Student> getStudentByName(@PathVariable(name = "studentName", required = true) String studentName) {
		return studentService.getStudentByName(studentName);
	}
	
	@GetMapping(path = "/list/last-name/{studentLastName}")
	public List<Student> getStudentByLastName(@PathVariable(name = "studentLastName", required = true) String studentLastName) {
		return studentService.getStudentByLastName(studentLastName);
	}
	
	@GetMapping(path = "/list/student-no/{studentNo}")
	public Student getStudentByNo(@PathVariable(name = "studentNo", required = true) int studentNo) {
		return studentService.getStudentByNo(studentNo);
	}
	
	@GetMapping(path = "/with-params")
	public List<Student> getStudentWithParams(@RequestParam(name = "id",required = false) Integer id
											 ,@RequestParam(name = "studentName",required = false) String studentName
											 ,@RequestParam(name = "studentLastName",required = false) String studentLastName
											 ,@RequestParam(name = "studentNo",required = false) Integer studentNo) {
		return studentService.getStudentWithParams(id,studentName,studentLastName,studentNo);
	}

}
