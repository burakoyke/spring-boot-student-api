package com.burakoyke.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	private int id;
	private String studentName;
	private String studentLastName;
	private int studentNo;

}
