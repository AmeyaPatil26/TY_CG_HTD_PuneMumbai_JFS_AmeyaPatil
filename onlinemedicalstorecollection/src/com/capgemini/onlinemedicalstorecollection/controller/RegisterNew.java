package com.capgemini.onlinemedicalstorecollection.controller;

import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.beans.AdminUserBean;
import com.capgemini.onlinemedicalstorecollection.dao.MedicalStoreDAO;
import com.capgemini.onlinemedicalstorecollection.exception.Exceptions;
import com.capgemini.onlinemedicalstorecollection.exception.MedicalException;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;
import com.capgemini.onlinemedicalstorecollection.main.MedicalMain;

public class RegisterNew {
	static Exceptions exception = new Exceptions();
	static boolean valid = false;
	static String emailvalid;
	static String passwordvalid;
	static Long mobilevalid;
	static int idvalid;
	static String nameValid;
	static Scanner sc = new Scanner(System.in);
	public void registerUser() {
		
		AdminUserBean adminUserBean = new AdminUserBean();
		MedicalStoreDAO dao = MedicalStoreFactory.getInstance();
		valid = true;
		while (valid) {
			System.out.println("Enter User Id");
			String id = sc.nextLine();
			try {
				idvalid = Exceptions.numberValidation(id);
				valid = false;
			} catch (MedicalException m) {
				m.getMessage();
			}
		}
		
		valid = true;
		while (valid) {
			System.out.println("Enter User Name and Surname");
			String name = sc.nextLine();
			try {
				nameValid = Exceptions.nameValidation(name);
				valid = false;
			} catch (MedicalException m) {
				m.getMessage();
			}
		}
		valid = true;
		while (valid) {
			System.out.println("Enter Email : ");
			String email = sc.nextLine();
			try {
				emailvalid = Exceptions.emailValidation(email);
				valid = false;
			} catch (MedicalException m) {
				m.getMessage();
			}
		}
		valid = true;
		while (valid) {
			System.out.println("Enter Password ");
			String password = sc.nextLine();
			try {
				passwordvalid = Exceptions.passwordValidation(password);
				valid = false;
			} catch (MedicalException m) {
				m.getMessage();
			}
		}
		valid = true;
		while (valid) {
			System.out.println("Enter Mobile No. ");
			String mobile = sc.nextLine();
			try {
				mobilevalid = Exceptions.mobileNumberValidation(mobile);
				valid = false;
			} catch (MedicalException m) {
				m.getMessage();
			}
		}
		
	
		System.out.println("Select User Type :");
		System.out.println("1. Admin \n2. User");
		
		int ch = Integer.parseInt(sc.nextLine());
		String type = null;
		switch (ch) {
		case 1:
			type = "admin";
			break;
		case 2:
			type = "user";
			break;
		default:
			break;
		}
		AdminUserBean adminBean = dao.registerUser(idvalid, nameValid, emailvalid, passwordvalid, type);
		if (adminBean != null) {
			System.out.println("Register Successfully");
			//new MedicalMain().main(null);
			while (true) {
				try {
					System.out.println("Press 1.Login\nPress 2.Back");
					String value = sc.next();
					int value1 = Exceptions.numberValidation(value);
					switch (value1) {
					case 1:
						new AdminOperations().login();
						break;
					case 2:
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

		} else {
			System.out.println("Unsuccessful");
		}

	}// End of register()
}
