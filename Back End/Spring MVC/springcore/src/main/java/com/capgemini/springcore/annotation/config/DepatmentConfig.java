package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotation.beans.DepartmentBean;

@Configuration
public class DepatmentConfig {

	@Bean(name = "dev")
	public DepartmentBean getDepartmentBean() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(901);
		bean.setDeptName("Dev");
		return bean;
		
	}//End of getDepartmentBean()

	@Bean(name = "hr")
	//@Primary
	public DepartmentBean getTestingDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(902);
		bean.setDeptName("Hr");
		return bean;
	}//End of getTesting()
	
	@Bean(name = "testing")
	public DepartmentBean getHrDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(902);
		bean.setDeptName("Testing");
		return bean;
	}//End of getHrDept()

	
}//End of class
