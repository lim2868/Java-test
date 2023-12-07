package com.kh.example.practice4.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{ // 초기화 블럭
		this.grade = 123;
		this.classroom = 123;
		this.name = "임재균";
		this.height = 173;
		this.gender = 'M';
	}
	
	public Student() {}
	
	public void information() {
				
		System.out.println(this.grade);
		System.out.println(this.classroom);
		System.out.println(this.name);
		System.out.println(this.height);
		System.out.println(this.gender);
	}
}