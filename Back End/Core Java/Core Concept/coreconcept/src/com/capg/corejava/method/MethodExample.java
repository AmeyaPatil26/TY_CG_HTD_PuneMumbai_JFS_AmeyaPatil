package com.capg.corejava.method;

public class MethodExample {
int y=10;
	public static void main(String[] args) {
		print();
		int f = areaOfSquare(5);
		System.out.println("Area of square " + f);
		// System.out.println(areaOfSquare(5));
		// MethodExample me=new MethodExample();
		// int area= new MethodExample().areaOfRec(2,5);
		// System.out.println("Area of rec "+area);
		System.out.println(new MethodExample().areaOfRec(2, 5));
	}

	public static void print() {
		System.out.println("Print()method");
	}

	public static int areaOfSquare(int side) {
		return side * side;
	}

	public int areaOfRec(int length, int width) {
		return (length * width);
	}
}
