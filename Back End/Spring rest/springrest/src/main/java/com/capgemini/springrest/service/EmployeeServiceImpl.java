package com.capgemini.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springrest.beans.EmployeeInfoBean;
import com.capgemini.springrest.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		
		return dao.getEmployee(empId);
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		return dao.authenticate(empId, password);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.addEmployee(employeeInfoBean);
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.updateEmployee(employeeInfoBean);
	}
	
	@Override
	public boolean deleteEmployee(int empId) {
		return dao.deleteEmployee(empId);
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		return dao.getAllEmployees();
	}

}// End of class
