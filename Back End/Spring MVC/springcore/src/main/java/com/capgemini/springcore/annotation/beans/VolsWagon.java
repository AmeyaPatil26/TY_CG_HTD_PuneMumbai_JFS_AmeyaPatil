package com.capgemini.springcore.annotation.beans;

import com.capgemini.springcore.interfaces.Engine;

public class VolsWagon implements Engine {

	@Override
	public int getCC() {
		return 1300;
	}

	@Override
	public String getType() {
		return "4-stroke Diesel";
	}

}//End of class
