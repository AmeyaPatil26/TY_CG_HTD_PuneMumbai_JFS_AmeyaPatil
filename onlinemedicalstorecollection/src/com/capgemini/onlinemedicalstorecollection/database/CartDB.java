package com.capgemini.onlinemedicalstorecollection.database;

import java.util.ArrayList;

import com.capgemini.onlinemedicalstorecollection.beans.CartBean;

public class CartDB {
	
public static ArrayList<CartBean> cal = new ArrayList<CartBean>();
	
	public ArrayList<CartBean> cartDB(){
		
		return cal;
		
	}
}
