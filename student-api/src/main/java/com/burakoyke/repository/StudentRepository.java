package com.burakoyke.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.burakoyke.model.Student;

@Repository
public class StudentRepository {
	
	@Autowired
	public List<Student> studentList;

	public List<Student> getAllStudents() {
		return studentList;
	}

}
