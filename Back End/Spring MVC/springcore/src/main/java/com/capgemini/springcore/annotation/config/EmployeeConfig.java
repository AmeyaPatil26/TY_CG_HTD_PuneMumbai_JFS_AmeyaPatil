package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotation.beans.DepartmentBean;
import com.capgemini.springcore.annotation.beans.EmployeeBean;


//to make class as configuration class
//instead of making .xml File we are using annotation @Configuration
@Import(DepatmentConfig.class)
@Configuration
public class EmployeeConfig {
	// make method of bean class
	@Bean
	public EmployeeBean getEmployeeBean() {
	// create EmployeeBean object and set value
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(101);
		employeeBean.setEmpName("Dipti");
		return employeeBean;

	}// End of getEmploye()
	
}// End of class
