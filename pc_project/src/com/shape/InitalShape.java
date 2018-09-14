package com.shape;

public class InitalShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		rec.set(20, 30);
		rec.circumference();
		rec.area();
		Circle cir = new Circle();
		cir.setRidus(500);
		cir.circumference();
		cir.area();

	}

}
