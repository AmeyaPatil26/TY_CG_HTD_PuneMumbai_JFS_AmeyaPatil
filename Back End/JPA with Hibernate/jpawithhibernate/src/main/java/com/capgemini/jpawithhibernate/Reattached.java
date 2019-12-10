package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reattached {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie data=entityManager.find(Movie.class, 2);
			
			System.out.println(data.getId());
			System.out.println(entityManager.contains(data));
			
			entityManager.detach(data);//to detached the object
			System.out.println(entityManager.contains(data));
			
			Movie movie=entityManager.merge(data);
			movie.setName("asdfg");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
		
	}//end of the main method

}//end of the class
