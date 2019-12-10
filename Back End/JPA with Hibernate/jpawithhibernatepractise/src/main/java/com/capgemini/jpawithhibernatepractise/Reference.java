package com.capgemini.jpawithhibernatepractise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sound.midi.Soundbank;

import com.capgemini.jpawithhibernatepractise.dto.Hotel_Bill;

public class Reference {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Hotel_Bill hotel=entityManager.getReference(Hotel_Bill.class, 1);
	System.out.println(hotel.getFood_name());
		
		
	}
}
