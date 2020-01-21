package com.capg.stream;

import java.util.Comparator;
import java.util.TreeSet;

public class TestB {

	public static void main(String[] args) {

		Comparator<Employee> comp=(e1,e2)->{
			if(e1.id>e2.id) {
				return 1;
			}else if(e1.id<e2.id) {
				return -1;
			}else {
				return 0;
			}
		};
		
		TreeSet<Employee> ts=new TreeSet<Employee>(comp);
		
		Employee e1=new Employee(1, "Jaya", 4.2);
		Employee e2=new Employee(2, "Raju", 5.2);
		Employee e3=new Employee(3, "Pooja",5.1);
		Employee e4=new Employee(4, "Kabya", 4.6);
		Employee e5=new Employee(5, "Nikita",4.8);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		for(Employee e:ts) {
			System.out.println("Name is "+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Height is "+ e.height);
			System.out.println("-----------------");
		}
		
		
	}

	}
