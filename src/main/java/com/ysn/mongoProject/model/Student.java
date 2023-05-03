package com.ysn.mongoProject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "student")
public class Student {
	@Id
	private long id;
	private String name;
	private double age;
	private int grade;
	public Student() {
		super();
	}
	
	public Student(long id,String name, double age, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	
}
