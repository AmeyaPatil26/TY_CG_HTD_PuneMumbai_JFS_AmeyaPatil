package com.capgemini.onlinemedicalstorecollection.controller;

import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.beans.AdminUserBean;
import com.capgemini.onlinemedicalstorecollection.beans.ProductBean;
import com.capgemini.onlinemedicalstorecollection.dao.MedicalStoreDAO;
import com.capgemini.onlinemedicalstorecollection.dao.ProductDAO;
import com.capgemini.onlinemedicalstorecollection.exception.Exceptions;
import com.capgemini.onlinemedicalstorecollection.exception.MedicalException;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;
import com.capgemini.onlinemedicalstorecollection.main.MedicalMain;
import com.capgemini.onlinemedicalstorecollection.validations.MedicalValidation;

public class AdminOperations {
	static Exceptions exception = new Exceptions();
	static boolean valid = false;
	static String emailvalid;
	static String passwordvalid;
	static int idValid;
	static int priceValid;
	static Scanner sc = new Scanner(System.in);

	public void login() {

		MedicalStoreDAO dao = MedicalStoreFactory.getInstance();

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
			System.out.println("Enter Pasword ");
			String password = sc.nextLine();
			try {
				passwordvalid = Exceptions.passwordValidation(password);
				valid = false;
			} catch (MedicalException m) {
				m.getMessage();
			}
		}
		AdminUserBean bean = dao.login(emailvalid, passwordvalid);
		try {
			if (bean != null) {

				if (bean.getType().equals("admin")) {
					System.out.println("Admin");
					adminPerform();
				} else {
					System.out.println("User");
					new UserOperations().choice(bean);
				}

			} else {
				System.out.println("Not login");
			}
		} catch (NullPointerException e) {

			System.err.println("Wrong mail or password");
			MedicalMain.main(null);
		}

	}// End of adminLogin()

	public static void addProductHere() {
		ProductDAO dao = MedicalStoreFactory.getProduct();
		valid = true;
		while (valid) {
			System.out.println("Enter Medicine Id :");
			String id = sc.nextLine();
			try {
				idValid = Exceptions.numberValidation(id);
				valid = false;
			} catch (MedicalException m) {
				m.getMessage();
			}
		}

		System.out.println("Enter Medicine name : ");
		String name = sc.nextLine();
		valid = true;
		while (valid) {
			System.out.println("Enter Price : ");
			String price = sc.nextLine();
			try {
				priceValid = Exceptions.numberValidation(price);
				valid = false;
			} catch (MedicalException m) {
				m.getMessage();
			}
		}

		int price = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Available :");
		String available = sc.nextLine();

		dao.addProdcut(idValid, name, priceValid, available);

	}

	public static void showProductHere() {
		ProductDAO pro = MedicalStoreFactory.getProduct();
		pro.showProduct();
	}

	public static void delProduct() {
		ProductDAO dao = MedicalStoreFactory.getProduct();
		dao.removeProdcut();
	}

	public static void updatePro() {
		ProductDAO update = MedicalStoreFactory.getProduct();
		System.out.print("\nEnter Medicine ID to Modify : ");
		int mdID = sc.nextInt();
		update.updateProduct(mdID);

	}
	
	public static void back() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Press 1.back");
		String value = scan.next();
		int value1;
		try {
			// int value1=scan.nextInt();
			value1 = Exceptions.numberValidation(value);
			switch (value1) {
			case 1:
				System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
				new MedicalMain().main(null);
				break;
			}

			/*
			 * if(value1==1) { main(null); } else { System.out.println("Enter integer"); }
			 */
		} catch (MedicalException e) {
			e.getMessage();
		}
	}

	public static void showDelUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Show user \n2.Delete User\n3.Back");
		valid = true;
		while (valid) {
			while (true) {
				try {
					String choice1 = scan.next();

					int del = Exceptions.numberValidation(choice1);
					switch (del) {
					case 1:
						MedicalStoreDAO view = MedicalStoreFactory.getInstance();
						view.showUser();
						showDelUser();
						break;
					case 2:
						MedicalStoreDAO del1 = MedicalStoreFactory.getInstance();
						System.out.println("Enter User Id :");
						int id = Integer.parseInt(sc.nextLine());
						del1.removeUser(id);
						showDelUser();
						break;
					case 3:
						adminPerform();
						break;
					default:
						System.out.println("Wrong option");
						break;
					}
				} catch (MedicalException e) {
					e.getMessage();

				}

				valid = false;
			}
		}
	}

	public static void adminPerform() {

		while (true) {
			System.out.println("Enter Your Choice ");
			System.out.println("Press 1 for Add Product");
			System.out.println("Press 2 for View  Product");
			System.out.println("Press 3 for Remove  Product");
			System.out.println("Press 4 for Operate User");
			System.out.println("Press 5 for Update Product");
			System.out.println("Press 6 for Discussion Board");
			System.out.println("Press 7 for Logout");
			Scanner scan = new Scanner(System.in);
			valid = true;

			try {
				while (valid) {
					String choice1 = scan.next();

					int choice = Exceptions.numberValidation(choice1);
					// int choice = Integer.parseInt(scan.nextLine());
					switch (choice) {
					case 1:
						addProductHere();
						break;
					case 2:
						showProductHere();
						break;
					case 3:
						delProduct();
						break;
					case 4:
						showDelUser();
						break;
					case 5:
						updatePro();
						break;
					case 6:
						System.out.println("discussion");
						break;

					case 7:
						System.out.println("Successfully Logged Out..!!");
						new MedicalMain().main(null);
						// s new Logout().call();

						break;
					default:
						System.err.println("Invalid OutPut Please Enter Correct OutPut");
						break;
					}
					valid = false;
				}
			} catch (MedicalException e) {
				e.getMessage();
			}
		}
	}// End of adminPerform()

}// End of class
