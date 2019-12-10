package com.capg.corejava.method;

public class Car {
	String name;
	String color;
	double price;

	public Car() {
		// no argument constructor created by programmer
		// in zero argument constructor we can write in body
	}

	public Car(String name) {

		this.name = name;
	}

	public Car(double price) {

		this.price = price;
	}

	public Car(String name, double price) {

	}

	public Car(double price, String name) {

	}

	public Car(String name, String color, double price) {
		// parameterized constructor
		this.name = name;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}
