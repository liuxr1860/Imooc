package com.shape;

public class Rectangle extends Shape {

	@Override
	void circumference() {
		// TODO Auto-generated method stub
		float Circle = (length+width)*2;
		System.out.println("长方形周长等于:"+Circle);
	}
	float length;
	float width;
	void set(float length,float width) {
		this.length = length;
		this.width = width;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		float Area = length*width;
		System.out.println("长方形面积等于:"+Area);
		
	}

}
