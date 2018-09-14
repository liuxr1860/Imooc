package com.shape;

public class Circle extends Shape {

	@Override
	void circumference() {
		// TODO Auto-generated method stub
		double Circle =  2*(3.14*ridus);
		System.out.println("Circle length = "+Circle);
	}
	float ridus;
	void setRidus(float ridus) {
		this.ridus = ridus;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		double area =  3.14*ridus*ridus;
		System.out.println("Circle area = "+area);
	}

}
