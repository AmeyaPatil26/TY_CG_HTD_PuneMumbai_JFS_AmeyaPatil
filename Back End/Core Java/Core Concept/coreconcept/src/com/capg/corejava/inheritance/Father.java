package com.capg.corejava.inheritance;

public class Father extends GrandFather implements InterfaceExample  {
	
	String fname = "Eddard";

	public static void main(String[] args) {
	new Father().printName();	
	}

	@Override
	  public void printName() { 
		 System.out.println(fname+" "+name+" "+lastname);
	 super.printName(); 
		 }
	@Override
	public void display() {
		System.out.println("Display method in Father");
	}
	@Override
	public void show() {
		System.out.println("show method in Father");
	}
	 

	 
}
