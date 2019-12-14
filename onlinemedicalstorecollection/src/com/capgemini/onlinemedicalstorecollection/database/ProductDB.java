package com.capgemini.onlinemedicalstorecollection.database;

import java.util.ArrayList;

import com.capgemini.onlinemedicalstorecollection.beans.ProductBean;

public class ProductDB {

public ArrayList<ProductBean> productData(){
		
		ArrayList<ProductBean> mal = new ArrayList<ProductBean>();
		
		ProductBean m1 = new ProductBean();
		m1.setProductId(1);
		m1.setProductName("Crocine");
		m1.setPrice(200);
		m1.setCategory("Allopathic");
		m1.setAvailability("in Stock");
		
		ProductBean m2 = new ProductBean();
		m2.setProductId(2);;
		m2.setProductName("Paracetamol");
		m2.setPrice(250);
		m2.setCategory("Allopathic");
		m2.setAvailability("out of Stock");
		
		ProductBean m3 = new ProductBean();
		m3.setProductId(3);
		m3.setProductName("dolo 360");
		m3.setPrice(50);
		m3.setCategory("Allopathic");
		m3.setAvailability("in Stock");
		
		mal.add(m1);
		mal.add(m2);
		mal.add(m3);
		
		return mal;
		
	}
	
}//End of class
