package com.capgemini.springcore.annotation.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {

	private int empId;
	private String empName;
	// dependency injection to connects employee and department, so give annotation
	// @Autowired instead of writing byType or ref in xml file manually
	@Autowired(required = false)
	@Qualifier("dev") // it should be with @Autowired. @qualifier take name which given in
	// bean(name="dev") in EmployeeConfig.java ,it is similar to id in xml file
	private DepartmentBean deptBean;

	// Getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public DepartmentBean getDeptBean() {
		return deptBean;
	}

	public void setDeptBean(DepartmentBean deptBean) {
		this.deptBean = deptBean;
	}

	// bean life-cycle method
	@PostConstruct
	public void init() {
		System.out.println("Its init Phase");
	}// End of init()

	@PreDestroy
	public void destroy() {
		System.out.println("Its destroy Phase!!");
	}// End of destroy()

}// End of class
