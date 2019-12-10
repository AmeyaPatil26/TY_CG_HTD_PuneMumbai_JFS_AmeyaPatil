package com.capg.corejava.cfs;

public class IfElseIfExample {

	public static void main(String[] args) {
		int marks = 75;
		if (marks >= 75) {
			System.out.println("Grade A");
		} 
		else if (marks >= 50 && marks <= 75) {
			System.out.println("Grade B");
		} 
		else if (marks <= 50 && marks >= 25) {
			System.out.println("Grade c");
		} 
		else {
			System.out.println("Fail");
		}
	}

}
