package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MobileBean;

public class MobileTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("mobileConfig.xml");
		MobileBean mobileBean = context.getBean("mobile",MobileBean.class);
		
		System.out.println("Brand Name: "+ mobileBean.getBrandName());
		System.out.println("Brand Model: "+ mobileBean.getModelName());
		System.out.println("Brand Price: "+ mobileBean.getPrice());
		System.out.println("Resolution : "+ mobileBean.getMobileDisplay().getResolution());
		System.out.println("DisplaySize: "+ mobileBean.getMobileDisplay().getDisplaySize());
	}//End of main
}//End of class
