package com.capg.bean;

public class TestB {

	public static void main(String[] args) {
		
		Car c=new Car(20,"benz");
		
		//we can not directly access the car variable
		//c.name="benz"; it gives error 
		
		System.out.println("Name is "+c.getName());
		System.out.println("Coast is "+c.getCost());
		
		Bus b=new Bus("baban", 1);
		System.out.println("Name is "+b.getName());
		System.out.println("Seat "+b.getSeats()); 
		
	}

}
