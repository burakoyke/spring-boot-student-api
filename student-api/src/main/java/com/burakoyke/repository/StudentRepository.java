package com.burakoyke.repository;

import java.util.ArrayList;
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

	public Student getStudentById(int id) {
		Student findStudent = null;
		for (Student student : studentList) {
			if (id == student.getId()) {
				findStudent = student;
			}
		}
		return findStudent;
	}

	public List<Student> getStudentByName(String studentName) {
		List<Student> findStudentList = new ArrayList<>();
		
		for (Student student : studentList) {
			if (studentName.equalsIgnoreCase(student.getStudentName())) {
				findStudentList.add(student);
			}
		}
		
		return findStudentList;
	}

	public List<Student> getStudentByLastName(String studentLastName) {
		List<Student> findStudentList = new ArrayList<>();
		
		for (Student student : studentList) {
			if (studentLastName.equalsIgnoreCase(student.getStudentLastName())) {
				findStudentList.add(student);
			}
		}
		
		return findStudentList;
	}

	public Student getStudentByNo(int studentNo) {
		Student findStudent = null;
		for (Student student : studentList) {
			if (studentNo == student.getStudentNo()) {
				findStudent = student;
			}
		}
		return findStudent;
	}

	public List<Student> getStudentWithParams(Integer id, String studentName, String studentLastName, Integer studentNo) {
	    List<Student> result = new ArrayList<>(studentList);

	    if (id != null && id > 0) {
	        result = result.stream()
	                .filter(s -> s.getId() == id)
	                .toList();
	    }

	    if (studentName != null && !studentName.isBlank()) {
	        result = result.stream()
	                .filter(s -> s.getStudentName().equalsIgnoreCase(studentName))
	                .toList();
	    }

	    if (studentLastName != null && !studentLastName.isBlank()) {
	        result = result.stream()
	                .filter(s -> s.getStudentLastName().equalsIgnoreCase(studentLastName))
	                .toList();
	    }

	    if (studentNo != null && studentNo > 0) {
	        result = result.stream()
	                .filter(s -> s.getStudentNo() == studentNo)
	                .toList();
	    }

	    return result;
	}

}
