package com.capgemini.onlinemedicalstorecollection.validations;

public interface MedicalValidation {

	public Integer numValidation(String num);

	public String emailValidation(String email);

	public String passValidation(String pass);
	public Boolean searchAdmin(String email);
	public String nameValidation(String name);
	public Integer cvvValidation(String cvv);
	public Long cardNumValidation(String cardno);
	public Integer monthValidation(String month);
	public Integer yearValidation(String year);
	public Long mobileValidation(String num);
}// End of interface
