package com.capgemini.jpawithhibernatepractise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.capgemini.jpawithhibernatepractise.dto.Hotel_Bill;

public class Insertion {

	public static void main(String[] args) {

		Hotel_Bill hotel=new Hotel_Bill();
		hotel.setItem_code(7);
		hotel.setFood_name("pav-bhaji");
		hotel.setPrice(50.6);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(hotel);
		System.out.println("Record saved");
		transaction.commit();
		
		
	}

}
