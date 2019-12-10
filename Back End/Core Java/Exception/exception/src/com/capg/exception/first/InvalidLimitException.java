package com.capg.exception.first;

public class InvalidLimitException extends Exception{
	private String message="Day limit is only 40000";

	@Override
	public String getMessage() {
		return message;
	}
	
	

}
