package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotation.beans.Medicine;

public class MedicineTest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("medicineConfig.xml");
		Medicine medicine=context.getBean("medicine",Medicine.class);
		
		System.out.println("Medicine Name= "+medicine.getName());
		System.out.println("Medicine Price= "+medicine.getPrice());
		System.out.println("Medicine Type= "+medicine.getType());
		//System.out.println("Drugs Contains= "+medicine.getDrugs());
		System.out.println("Drugs Contains= "+medicine.getDrugsSet());
		
	}//End of main()
}//ENd of class
