package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class RetriveDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String jpql="from Movie";
		Query query=entityManager.createQuery(jpql);
		List<Movie> list=query.getResultList();
		for(Movie m:list) {
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getRating());
		System.out.println("------------------");
		}
		entityManager.close();
	}//end of the main

}//end of the class
