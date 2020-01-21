package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateModify {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String jpql="Update Movie set name=:name, rating=:rating where id=:id ";
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Query query=entityManager.createQuery(jpql);
		query.setParameter("name", "JKLM");
		query.setParameter("rating", "good");
		query.setParameter("id", 3);
		
		int result=query.executeUpdate();
	transaction.commit();
		System.out.println("Result "+result);
			entityManager.close();
	}//end of the main
}