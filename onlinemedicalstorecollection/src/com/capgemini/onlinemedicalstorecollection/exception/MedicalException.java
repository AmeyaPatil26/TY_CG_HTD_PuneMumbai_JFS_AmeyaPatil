package com.capgemini.onlinemedicalstorecollection.exception;

public class MedicalException extends Exception{

	private static final long serialVersionUID = 1L;

	public MedicalException(String exp) {
		System.err.println(exp);
	}//End of constructor
	
}//End of class
