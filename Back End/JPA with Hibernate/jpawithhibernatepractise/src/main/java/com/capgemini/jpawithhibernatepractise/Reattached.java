package com.capgemini.jpawithhibernatepractise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.sound.midi.Soundbank;

import com.capgemini.jpawithhibernatepractise.dto.Hotel_Bill;

public class Reattached {

	public static void main(String[] args) {
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Hotel_Bill hotel=entityManager.find(Hotel_Bill.class,1 );
			System.out.println("id : "+hotel.getItem_code());
			System.out.println("value present " +entityManager.contains(hotel));
			
			entityManager.detach(hotel);
			System.out.println("value present " +entityManager.contains(hotel));
			
			Hotel_Bill data=entityManager.merge(hotel);
			data.setFood_name("Appe");
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
System.out.println("duplicate input");
		}
	
	}
}
