package com.capgemini.jpawithhibernatepractise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernatepractise.dto.Hotel_Bill;

public class Delete {

	public static void main(String[] args) {

		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			 transaction=entityManager.getTransaction();
			transaction.begin();
			Hotel_Bill hotel=entityManager.find(Hotel_Bill.class, 7);
			entityManager.remove(hotel);
			System.out.println("Record deleted succesful");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			System.out.println(" No value prsent in database");
			}
		
		
	}

}
