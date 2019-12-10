package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.capgemini.jpawithhibernate.dto.Movie;

public class UpdateDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String jpql="Update Movie set name='KLMN' where id=4 ";
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Query query=entityManager.createQuery(jpql);
		int result=query.executeUpdate();
		transaction.commit();
		System.out.println("Result "+result);
			entityManager.close();
	}//end of the main

}//end if the class
