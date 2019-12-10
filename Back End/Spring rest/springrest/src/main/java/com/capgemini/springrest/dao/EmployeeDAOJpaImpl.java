package com.capgemini.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.springrest.beans.EmployeeInfoBean;


@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
	@PersistenceUnit
	private EntityManagerFactory emf ;

	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		EntityManager manager = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		manager.close();

		return employeeInfoBean;

	}// End of getEmployee

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean where empId = :empId and password = :password";
		Query query = manager.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("password", password);

		EmployeeInfoBean employeeInfoBean = null;
		try {
			employeeInfoBean = (EmployeeInfoBean) query.getSingleResult();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeInfoBean;
//		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
//		manager.close();
//		if (password.equals(employeeInfoBean.getPassword())) {
//			return true;
//		} else {
//		
//		return false;
//		}

	}// end of authentication

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		boolean isAdded = false;
		try {
			tx.begin();
			manager.persist(employeeInfoBean);
			tx.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();

		return isAdded;
	}// End of addEmployee

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManager manager = emf.createEntityManager();
		EmployeeInfoBean existingEmployeInfo = manager.find(EmployeeInfoBean.class, employeeInfoBean.getEmpId());
		boolean isUpdate = false;

		if (existingEmployeInfo != null) {
			String name = employeeInfoBean.getEmpName();
			if (name != null) {
				existingEmployeInfo.setEmpName(name);
			}
			int age = employeeInfoBean.getAge();
			if (age > 18) {
				existingEmployeInfo.setAge(age);
			}

			double salary = employeeInfoBean.getSalary();
			if (salary > 0) {
				existingEmployeInfo.setSalary(salary);
			}
			long mobile = employeeInfoBean.getMobile();
			if (mobile > 0) {
				existingEmployeInfo.setMobile(mobile);
			}
			String designation = employeeInfoBean.getDesignation();
			if (designation != null) {
				existingEmployeInfo.setDesignation(designation);
			}
			String password = employeeInfoBean.getPassword();
			if (password != null) {
				existingEmployeInfo.setPassword(password);
			}

			char gender = employeeInfoBean.getGender();
			if (gender == 'M' || gender == 'F' || gender == 'm' || gender == 'f') {
				existingEmployeInfo.setGender(gender);
			}
			try {
				EntityTransaction tx = manager.getTransaction();
				tx.begin();
				manager.persist(existingEmployeInfo);
				tx.commit();
				isUpdate = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			manager.close();
		}

		return isUpdate;
	}// end of updateEmployee

	@Override
	public boolean deleteEmployee(int empId) {
		//EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employeePersistenceUnit");
		//EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityManager entityManager = emf.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			EmployeeInfoBean employeeInfoBean= entityManager.find(EmployeeInfoBean.class, empId);
			entityManager.remove(employeeInfoBean);
			tx.commit();
			isDeleted = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		entityManager.close();
		return isDeleted;
	}// End of deleteEmployee()

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean";
		Query query = manager.createQuery(jpql);
		
		List<EmployeeInfoBean> employeesList = null;
		try {
			employeesList = query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employeesList;
		
	}// End of getAllEmployees()
}// End of class
