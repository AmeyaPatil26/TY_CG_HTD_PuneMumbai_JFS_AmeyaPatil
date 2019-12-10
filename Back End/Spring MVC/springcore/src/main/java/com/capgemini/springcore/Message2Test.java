package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessagBean2;
import com.capgemini.springcore.beans.MessageBean;

public class Message2Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MessagBean2 messagBean2= context.getBean("messageBean2", MessagBean2.class);
		
		System.out.println("Message= "+messagBean2.getMessage());
		
		//after close destroy method execute
		((AbstractApplicationContext)context).close();
		
	}//End of main
}//End of class
