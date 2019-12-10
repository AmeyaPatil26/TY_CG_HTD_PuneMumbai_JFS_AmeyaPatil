package com.capg.Array;

interface CirclEx {
	double getCircle(double r);
}

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CirclEx m = r -> 3.142 * r * r;
		double j = m.getCircle(1.2);
		System.out.println("Area of circle " + j);

	}

}
