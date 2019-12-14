package com.capgemini.onlinemedicalstorecollection.exception;

import com.capgemini.onlinemedicalstorecollection.validations.MedicalValidation;
import com.capgemini.onlinemedicalstorecollection.validations.MedicalValidationImpl;

public class Exceptions {

	static MedicalValidation  medicalValidation = new MedicalValidationImpl(); 
	
	public static String emailValidation(String email) throws MedicalException {
		String emailVal = medicalValidation.emailValidation(email);
		if (emailVal !=  null) {
			return emailVal;
		} else {
			throw new MedicalException("Invalid input \nPlease Enter the Email in abc@gmail.com format");
		}
		
	}
	
	public static Integer numberValidation (String num) throws MedicalException {
		
		Integer number = medicalValidation.numValidation(num);
		if(number != null) {
			return number;
		} else {
			throw new MedicalException("Input Mismatch... \n Please Enter the Integer value");
		}

	}//End of numberValiation()
	
	public static String passwordValidation(String password) throws MedicalException{
		String pwd = medicalValidation.passValidation(password);
		if(pwd != null) {
			return pwd;
		} else {
			throw new MedicalException("Please Enter the valid Password upto 8 charachter");
		}
	}//End of passwordValidation()
	
	public static Integer cvvNumberValidation(String cvv) throws MedicalException{
		Integer cvvNo = medicalValidation.cvvValidation(cvv);
		if(cvvNo != null) {
			return cvvNo;
		} else {
			throw new MedicalException("Please Enter the valid 3 digit CVV number eg.253");
		}
	}
	
	public static Long mobileNumberValidation(String num) throws MedicalException{
		Long mobileNo = medicalValidation.mobileValidation(num);
		if(mobileNo != null) {
			return mobileNo;
		} else {
			throw new MedicalException("Please Enter the valid 10 digit Mobile number");
		}
	}//End of mobileNumberValidation()
	
	public static Integer monthValidation (String num) throws MedicalException {
		Integer month = medicalValidation.numValidation(num);
		if(month != null && month <= 12 && month >=1) {
			return month;
		} else {
			throw new MedicalException(" Please Enter the valid month eg.02");
		}

	}//End of monthValiation()
	
	public static Integer yearValidation (String num) throws MedicalException {
		Integer year = medicalValidation.numValidation(num);
		if(year != null && year>2010 && year<2030) {
			return year;
		} else {
			throw new MedicalException(" Please Enter the valid Year eg.2012");
		}

	}//End of yearValiation()
	public static String nameValidation(String name) throws MedicalException{
		String nameValid = medicalValidation.nameValidation(name);
		if(nameValid != null) {
			return nameValid;
		} else {
			throw new MedicalException("Please Enter Name and Surname");
		}
	}//End of mobileNumberValidation()
	public static Long cardValidation(String number) throws MedicalException{
		Long cardNo = medicalValidation.cardNumValidation(number);
		if(cardNo != null) {
			return cardNo;
		} else {
			throw new MedicalException("Please Enter the valid 16 digit card number");
		}
	}//End of cvvNumberValidation()

}//End of Exceptions
