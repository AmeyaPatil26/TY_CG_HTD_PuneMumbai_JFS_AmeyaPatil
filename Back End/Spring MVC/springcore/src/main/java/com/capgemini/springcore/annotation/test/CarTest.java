package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotation.beans.Car;


public class CarTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("carConfig.xml");
		Car myCar = context.getBean("myCar",Car.class);
		
		System.out.println("Model no: "+myCar.getModelNum() );
		System.out.println("Model Name: "+myCar.getModelName() );
		System.out.println("Engine Details------ ");
		System.out.println("Engine CC: "+myCar.getEngine().getCC() );
		System.out.println("Engine Type: "+myCar.getEngine().getType() );
		
	}//End of main()
}//End of class
