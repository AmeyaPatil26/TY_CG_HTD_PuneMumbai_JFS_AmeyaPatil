package com.capg.sorting.set;

public class EmployeeTree implements Comparable<EmployeeTree> {
	
	int id ;
	String name;
	double salary;
	
	public EmployeeTree(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(EmployeeTree e) {
		
	Integer k=this.id;
	Integer p=e.id;
	return k.compareTo(p);
			

	}
}
