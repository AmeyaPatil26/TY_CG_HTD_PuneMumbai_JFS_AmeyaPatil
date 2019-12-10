package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {

	public static void main(String[] args) {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
EntityManager entityManager=entityManagerFactory.createEntityManager();
String jpql="Delete Movie where id=3 ";
EntityTransaction transaction=entityManager.getTransaction();
transaction.begin();
Query query=entityManager.createQuery(jpql);
int result=query.executeUpdate();

System.out.println("Result "+result);
	entityManager.close();
		
	}

}
