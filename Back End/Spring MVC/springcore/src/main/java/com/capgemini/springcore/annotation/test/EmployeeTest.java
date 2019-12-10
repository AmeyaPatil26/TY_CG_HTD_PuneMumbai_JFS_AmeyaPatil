package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotation.beans.EmployeeBean;
import com.capgemini.springcore.annotation.config.DepatmentConfig;
import com.capgemini.springcore.annotation.config.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//get Annotation context from EmployeeConfig
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		//to close container we can use registerShutdownHook() or close()
		((AbstractApplicationContext)context).registerShutdownHook();
		//getBean from EmployeeBean
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		System.out.println("EmpId:"+employeeBean.getEmpId());
		System.out.println("Emp Name:"+employeeBean.getEmpName());
		System.out.println("----Department-Info----");
		System.out.println("Dept Id:"+employeeBean.getDeptBean().getDeptId());
		System.out.println("Dept Name:"+employeeBean.getDeptBean().getDeptName());
		
		//to close container
		//((AbstractApplicationContext)context).close();
	}//End of main()
}//End of class

