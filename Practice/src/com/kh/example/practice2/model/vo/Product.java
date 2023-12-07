package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	public Product() {
		this.pName = "신발";
		this.price = 50000;
		this.brand = "나이키";
	}
	
	public void information() {
		System.out.println(this.pName);
		System.out.println(this.price);
		System.out.println(this.brand);
	}
}
