package com.capgemini.onlinemedicalstorecollection.controller;

import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.beans.AdminUserBean;
import com.capgemini.onlinemedicalstorecollection.beans.ProductBean;
import com.capgemini.onlinemedicalstorecollection.dao.MedicalStoreDAOImpl;
import com.capgemini.onlinemedicalstorecollection.dao.ProductDAO;
import com.capgemini.onlinemedicalstorecollection.dao.ProductDAOImpl;
import com.capgemini.onlinemedicalstorecollection.dao.UserCartDAO;
import com.capgemini.onlinemedicalstorecollection.exception.Exceptions;
import com.capgemini.onlinemedicalstorecollection.exception.MedicalException;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;
import com.capgemini.onlinemedicalstorecollection.main.MedicalMain;

public class UserOperations {
	static ProductDAO productDAO = new ProductDAOImpl();
	static Scanner scan = new Scanner(System.in);
	static Exceptions exception = new Exceptions();
	static boolean valid = false;
	static int idValid;
	static int delValid;
	static String name;
	static long card;
	static int cvv;
	static int monthValid;
	static int yearValid;

	static Scanner sc = new Scanner(System.in);
	public void choice(AdminUserBean userBean) {

		while (true) {
			try {
				System.out.println("Enter Your Choice ");
				System.out.println("Press 1 for View Medicine");
				System.out.println("Press 2 for Add Medicine to Cart");
				System.out.println("Press 3 for Change Password");
				System.out.println("Press 4 for View Cart");
				System.out.println("Press 5 for Generate Bill");
				System.out.println("Press 6 for Discussion Board");
				System.out.println("Press 7 for Logout");

				int choice = Integer.parseInt(scan.nextLine());
				switch (choice) {
				case 1:
					AdminOperations op = new AdminOperations();
					op.showProductHere();
					break;
				case 2:
					addInCart();
					break;
				case 3:
					MedicalStoreDAOImpl med = new MedicalStoreDAOImpl();
					med.resetPassword();
					break;
				case 4:
					viewCart();
					break;
				case 5:
					UserOperations bill = new UserOperations();
					bill.bill();
					System.out.println("Press 1.Proceed to Payment\nPress 2.Back ");
					int value = scan.nextInt();
					switch (value) {
					case 1:
						payment();
						break;
					case 2:
						// choice(userBean);
						
						break;
					default:
						System.out.println("Wrong input ...");
					}
					break;
				case 6:
					message();
					System.out.println();
					break;
				case 7:
					System.out.println("Successfully Logged Out..!!");
					new MedicalMain().main(null);
					// new Logout().call();

				default:
					System.err.println("Invalid OutPut Please Enter Correct OutPut");
					break;
				}
			} catch (Exception e) {

			}

		} // End of choice()
	}

	public static void addInCart() {
		AdminUserBean bean = new AdminUserBean();
		ProductBean medicineBean = new ProductBean();
		UserCartDAO dao = MedicalStoreFactory.getCart();
		dao.addCart(medicineBean, bean);

	}

	public static void bill() {
		UserCartDAO dao = MedicalStoreFactory.getCart();
		dao.getBill();
	}

	public static void viewCart() {

		UserCartDAO dao = MedicalStoreFactory.getCart();
		dao.getCart();

	}

	public static void payment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Please Enter your Card details-----");
		valid = true;
		while (valid) {
			try {
				System.out.println("Enter the your name");
				String availability1 = sc.nextLine();
				name = exception.nameValidation(availability1);
				valid = false;
			} catch (MedicalException e) {
				e.getMessage();
			}
		}
		valid = true;
		while (valid) {
			try {
				System.out.println("Enter Debit card no");
				String debitcard = sc.nextLine();
				card = exception.cardValidation(debitcard);
				valid = false;
			} catch (MedicalException e) {
				e.getMessage();
			}
		}

		valid = true;
		while (valid) {
			try {
				System.out.println("Enter CVV no");
				String cvvNo = sc.nextLine();
				cvv = exception.cvvNumberValidation(cvvNo);
				valid = false;
			} catch (MedicalException e) {
				e.getMessage();
			}
		}
		valid = true;
		while (valid) {
			try {
				System.out.println("Enter Month");
				String month = sc.nextLine();
				monthValid = exception.monthValidation(month);
				valid = false;
			} catch (MedicalException e) {
				e.getMessage();
			}
		}
		valid = true;
		while (valid) {
			try {
				System.out.println("Enter Year");
				String year = sc.nextLine();

				yearValid = exception.yearValidation(year);
				valid = false;
			} catch (MedicalException e) {
				e.getMessage();
			}
		}
		System.out.println("          Transaction Is successful");
		System.out.println("------------------Thank You Visit Again --------------");
		System.out.println();
	
	}// End of Payment()
	
	public static void message() {
		System.out.println("Enter the message");
		scan.nextLine();
		System.out.println("Thank you,We will respond you soon...");
	}

}// End of userOperations()
