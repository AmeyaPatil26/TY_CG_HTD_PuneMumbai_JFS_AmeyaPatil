package com.capg.corejava.inheritance;

public class Daughter extends Father implements InterfaceExample{
	String dname = "Sansa";

	public static void main(String[] args) {

		new Daughter().printName();
		new Daughter().display();
		new Daughter().show();
	}

	@Override
	public void printName() {
		System.out.println(dname + " " + fname + " " + lastname);
		super.printName();
	}
	@Override
	public void display() {
		System.out.println("Display method in daughter");
	}
	@Override
	public void show() {
		System.out.println("show method in daughter");
	}
	 


}
