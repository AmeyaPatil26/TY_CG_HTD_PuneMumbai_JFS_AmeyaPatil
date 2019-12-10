package com.capgemini.jpawithhibernatepractise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernatepractise.dto.Hotel_Bill;

public class Update {

	public static void main(String[] args) {
	
		EntityTransaction transaction=null;
		Hotel_Bill hotel=new Hotel_Bill();
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Hotel_Bill h=entityManager.find(Hotel_Bill.class, 1);
			h.setPrice(32.5);
			System.out.println("record saved");
			transaction.commit();
			
		} catch (Exception e) {

			transaction.rollback();
			System.out.println("Please check inpur value");
		}

	}

}
