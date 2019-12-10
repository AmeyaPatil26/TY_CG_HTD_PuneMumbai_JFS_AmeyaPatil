package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jawithhibernate.onetomany.Pencil;
import com.capgemini.jawithhibernate.onetomany.PencilBox;

public class TestManyToOne {

	public static void main(String[] args) {

		
		PencilBox pencilBox=new PencilBox();
		pencilBox.setBoxid(5);
		pencilBox.setBname("Natraj");
		
		Pencil pencil =new Pencil();
		pencil.setPid(16);
		pencil.setColor("green");
		pencil.setPencilBox(pencilBox);
		
		Pencil pencil1 =new Pencil();
		pencil1.setPid(17);
		pencil1.setColor("yellow");
		pencil1.setPencilBox(pencilBox);
		
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			
			transaction.commit();
		} catch (Exception e) {
		
			e.printStackTrace();
			transaction.rollback();
			System.out.println("Your enterd value already present");
		}
		entityManager.close();
	}//end of main
}
