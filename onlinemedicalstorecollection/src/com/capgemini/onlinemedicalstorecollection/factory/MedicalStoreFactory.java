package com.capgemini.onlinemedicalstorecollection.factory;

import com.capgemini.onlinemedicalstorecollection.dao.MedicalStoreDAO;
import com.capgemini.onlinemedicalstorecollection.dao.MedicalStoreDAOImpl;
import com.capgemini.onlinemedicalstorecollection.dao.ProductDAO;
import com.capgemini.onlinemedicalstorecollection.dao.ProductDAOImpl;
import com.capgemini.onlinemedicalstorecollection.dao.UserCartDAO;
import com.capgemini.onlinemedicalstorecollection.dao.UserCartDAOImpl;
import com.capgemini.onlinemedicalstorecollection.validations.MedicalValidation;
import com.capgemini.onlinemedicalstorecollection.validations.MedicalValidationImpl;

public class MedicalStoreFactory {

	private MedicalStoreFactory() {

	}

	public static MedicalStoreDAO getInstance() {
		MedicalStoreDAO dao = new MedicalStoreDAOImpl();
		return dao;
	}// End of getInstance()

	public static ProductDAO getProduct() {
		ProductDAO pro = new ProductDAOImpl();
		return pro;
	}// End of getInstance()

	public static UserCartDAO getCart() {
		UserCartDAO cart = new UserCartDAOImpl();
		return cart;
	}// End of getCart()
	
	public static MedicalValidation getValid() {
		MedicalValidation validation = new MedicalValidationImpl();
		return validation;
	}//End of getValid()
}//End of factory

