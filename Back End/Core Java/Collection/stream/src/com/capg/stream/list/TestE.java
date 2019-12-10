
package com.capg.stream.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.capg.stream.Employee;

public class TestE {

	public static void main(String[] args) {

		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(1,"Jaya",5.3));
		al.add(new Employee (2,"Raju",4.3));
		
		Comparator<Employee> comp=(e1,e2)-> e1.name.compareTo(e2.name);
		List<Employee> li=al.stream().sorted(comp).collect(Collectors.toList());
		Iterator<Employee> it=al.iterator();
		while(it.hasNext())
		{
		Employee r=it.next();
		System.out.println(r.name);
		}	
		
		}

}
