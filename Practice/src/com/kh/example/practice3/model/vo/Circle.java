package com.kh.example.practice3.model.vo;

public class Circle {
	
	private final double PI = 3.14;
	private int radius = 1;
	
	public Circle(){}
	
	
	public void incrementRadius() {
		this.radius++;
	}
	public void getAreaOfCircle() {
		System.out.println("면적 : " + PI*this.radius*this.radius);
	}
	public void getSizeOfCircle() {
		System.out.println("둘레 : " + PI*this.radius*2);
	}
}
