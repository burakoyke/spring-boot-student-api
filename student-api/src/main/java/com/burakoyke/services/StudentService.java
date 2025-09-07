package com.burakoyke.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.burakoyke.model.Student;
import com.burakoyke.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.getAllStudents();
	}

	public Student getStudentById(int id) {
		
		return studentRepository.getStudentById(id);
	}

	public List<Student> getStudentByName(String studentName) {
		// TODO Auto-generated method stub
		return studentRepository.getStudentByName(studentName);
	}

	public List<Student> getStudentByLastName(String studentLastName) {
		return studentRepository.getStudentByLastName(studentLastName);
	}

	public Student getStudentByNo(int studentNo) {
		return studentRepository.getStudentByNo(studentNo);
	}

	public List<Student> getStudentWithParams(Integer id, String studentName, String studentLastName, Integer studentNo) {
		
		return studentRepository.getStudentWithParams(id,studentName,studentLastName,studentNo);
	}

}
