package com.capgemini.springcore.beans;

public class MessagBean2 {
	private String message;

	public MessagBean2() {
		System.out.println("In constructor");
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("init () ");
	}
	public void destroy() {
		System.out.println("destroy() ");
	}
}//
