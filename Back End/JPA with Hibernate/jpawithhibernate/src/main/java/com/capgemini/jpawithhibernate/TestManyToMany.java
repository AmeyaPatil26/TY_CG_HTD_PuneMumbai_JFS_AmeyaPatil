package com.capgemini.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.capgemini.jawithhibernate.manytomany.Course;
import com.capgemini.jawithhibernate.manytomany.Student;


public class TestManyToMany {

	public static void main(String[] args) {

		Course course = new Course();
		course.setCid(3);
		course.setCname("Jdbc");
		
		Course course1 = new Course();
		course1.setCid(4);
		course1.setCname("Jdbc");
		ArrayList<Course > aList=new ArrayList<Course>();

		aList.add(course);
		aList.add(course1);
		
		Student student = new Student();
		student.setId(1);
		student.setSname("kavya");
		student.setCourse(aList);
		
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setSname("Lalita");
		student1.setCourse(aList);
		//student.setCourse(aList);

		EntityTransaction transaction = null;
		EntityManagerFactory entityManagerFactory=null;
		try {
			
			entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			
			//entityManager.persist(student1);
			//entityManager.persist(student);
	
			Course course2=entityManager.find(Course.class, 3);
			course2.getStudent().get(0).getId();
			transaction.commit();

		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();

		}

	}
}
