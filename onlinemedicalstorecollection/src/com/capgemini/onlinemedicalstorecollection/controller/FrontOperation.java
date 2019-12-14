package com.capgemini.onlinemedicalstorecollection.controller;

import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.exception.Exceptions;
import com.capgemini.onlinemedicalstorecollection.exception.MedicalException;
import com.capgemini.onlinemedicalstorecollection.main.MedicalMain;

import sun.applet.Main;

public class FrontOperation {
 public static void front() {

	 Scanner scan = new Scanner(System.in);
		int choice1;
		try {
			String choice = scan.next();
			choice1 = Exceptions.numberValidation(choice);

			switch (choice1) {
			case 1:
				new AdminOperations().login();
				System.out.println();
				break;

			case 2:
				new AdminOperations().login();
				System.out.println();
				break;
			case 3:
				RegisterNew reg = new RegisterNew();
				reg.registerUser();
				break;
			case 4:
				AdminOperations show = new AdminOperations();
				show.showProductHere();
				while (true) {
					try {
						System.out.println("Press 1.back\n");
						String value = scan.next();
						int value1 = Exceptions.numberValidation(value);
						switch (value1) {
						case 1:
							System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
							new MedicalMain().main(null);
							break;
						default:
							System.out.println("Wrong input");
							break;
						}
					} catch (MedicalException e) {
						e.getMessage();
					}
				}

			default:
				System.out.println("Enter the Write Choice");
			}
		} catch (MedicalException e) {
			e.getMessage();
		}
	
 }

}
