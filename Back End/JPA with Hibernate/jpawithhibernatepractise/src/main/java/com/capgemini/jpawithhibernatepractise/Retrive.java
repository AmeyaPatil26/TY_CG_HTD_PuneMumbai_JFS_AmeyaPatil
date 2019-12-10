package com.capgemini.jpawithhibernatepractise;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernatepractise.dto.Hotel_Bill;

public class Retrive {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Hotel_Bill hotel=entityManager.find(Hotel_Bill.class, 1);
		System.out.println("Item code "+hotel.getItem_code());
		System.out.println("Food name "+hotel.getFood_name());
		System.out.println("Price "+hotel.getPrice());
		System.out.println("_______________");
		
	}

}
