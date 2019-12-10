package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;
import com.capgemini.jpawithhibernate.onetoone.Person;
import com.capgemini.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Person person =new Person();
		person.setPid(11);
		person.setName("KLMN");
		
		VoterCard votercard=new VoterCard();
		votercard.setVoter_id(36);
		votercard.setAddress("asdfg");
		person.setVotercard(votercard);
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			//entityManager.persist(person);
			VoterCard cardDetail=entityManager.find(VoterCard.class, 36);
			cardDetail.getVoter_id();
			cardDetail.getAddress();
			cardDetail.getPerson().getPid();
			cardDetail.getPerson().getName();
			System.out.println("Record saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			
			e.printStackTrace();
			System.out.println("Your enterd value already present");
		}
		entityManager.close();
	}//end of main

}//end class
