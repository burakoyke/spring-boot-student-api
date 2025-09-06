package com.burakoyke.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.burakoyke.model.Student;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Student> studentList() {
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(1, "Ahmet", "Yılmaz", 1001));
        studentList.add(new Student(2, "Ayşe", "Demir", 1002));
        studentList.add(new Student(3, "Mehmet", "Kara", 1003));
        studentList.add(new Student(4, "Elif", "Şahin", 1004));
        studentList.add(new Student(5, "Burak", "Özkan", 1005));
        studentList.add(new Student(6, "Zeynep", "Çelik", 1006));
        studentList.add(new Student(7, "Mert", "Koç", 1007));
        studentList.add(new Student(8, "Selin", "Aslan", 1008));
        studentList.add(new Student(9, "Can", "Aydın", 1009));
        studentList.add(new Student(10, "Ece", "Güneş", 1010));
		
		return studentList;
		
	}
	

}
