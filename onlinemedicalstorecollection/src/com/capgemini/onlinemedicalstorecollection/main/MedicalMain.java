package com.capgemini.onlinemedicalstorecollection.main;

import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.controller.AdminOperations;
import com.capgemini.onlinemedicalstorecollection.controller.FrontOperation;
import com.capgemini.onlinemedicalstorecollection.controller.RegisterNew;
import com.capgemini.onlinemedicalstorecollection.dao.MedicalStoreDAO;
import com.capgemini.onlinemedicalstorecollection.dao.MedicalStoreDAOImpl;
import com.capgemini.onlinemedicalstorecollection.exception.Exceptions;
import com.capgemini.onlinemedicalstorecollection.exception.MedicalException;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class MedicalMain {
	static boolean valid = true;

	public static void main(String[] args) {
		MedicalStoreDAO dao = MedicalStoreFactory.getInstance();
		MedicalStoreDAOImpl user = new MedicalStoreDAOImpl();
		Scanner scan = new Scanner(System.in);
		int choice1;
		while (true) {

			System.out.println("------------------------------------------");
			System.out.println("           Online Medical Store            ");
			System.out.println("------------------------------------------");
			System.out.println("Press 1.Admin Login \nPress 2.User Login \nPress 3.User Register\nPress 4.Visit ");
			System.out.println("Select from above option ");
			while (true) {
				 FrontOperation.front();
			}
		} // end of while
	}// end of the main
}// End of class
