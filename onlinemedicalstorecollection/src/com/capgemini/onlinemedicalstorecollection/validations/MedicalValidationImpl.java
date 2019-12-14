package com.capgemini.onlinemedicalstorecollection.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.onlinemedicalstorecollection.dao.MedicalStoreDAO;
import com.capgemini.onlinemedicalstorecollection.factory.MedicalStoreFactory;

public class MedicalValidationImpl implements MedicalValidation{
MedicalStoreDAO dao = MedicalStoreFactory.getInstance();

	Pattern pat = null;
	Matcher mat = null;
	
	@Override
	public Integer numValidation(String id) {

		pat = Pattern.compile("\\d{1,10}");
		mat = pat.matcher(id);
		if(mat.matches()) {
			return Integer.parseInt(id);
		}
		return null;
	}
	
	
	@Override
	public String emailValidation(String email) {

		pat = Pattern.compile("\\w+\\@\\D+\\.\\D+");
		mat = pat.matcher(email);
		if(mat.matches()) {
			return email;
		}
		return null;
	}

	
	@Override
	public String passValidation(String pass) {

		pat = Pattern.compile(".{8,}");
		mat = pat.matcher(pass);
		if(mat.matches()) {
			return pass;
		}
		return null;
	}


	@Override
	public Boolean searchAdmin(String email) {
		return dao.searchAdmin(email);
	}


	@Override
	public Integer cvvValidation(String cvv) {
		pat = Pattern.compile("\\d{3}");
		mat = pat.matcher(cvv);
		if(mat.matches()) {
			return Integer.parseInt(cvv);
		}
		return null;
	}


	@Override
	public String nameValidation(String name) {
		pat = Pattern.compile("\\D+\\s\\D+");
		mat = pat.matcher(name);
		if(mat.matches()) {
			return name;
		}
		return null;
	}


	@Override
	public Long cardNumValidation(String cardno) {
		pat = Pattern.compile("\\d{16}");
		mat = pat.matcher(cardno);
		if(mat.matches()) {
			return Long.parseLong(cardno);
		}
		return null;
	}


	@Override
	public Integer monthValidation(String month) {
		pat = Pattern.compile("(1[0-2]|0[1-9])");
		mat = pat.matcher(month);
		if(mat.matches()) {
			return Integer.parseInt(month);
		}
		return null;
	}

	@Override
	public Integer yearValidation(String year) {
		pat = Pattern.compile("	[0-9]{4}]");
		mat = pat.matcher(year);
		if(mat.matches()) {
			return Integer.parseInt(year);
		}
		return null;
	}


	@Override
	public Long mobileValidation(String num) {
		pat = Pattern.compile("\\d{10}");
		mat = pat.matcher(num);
		if(mat.matches()) {
			return Long.parseLong(num);
		}
		return null;
	}

	
}//End of class
