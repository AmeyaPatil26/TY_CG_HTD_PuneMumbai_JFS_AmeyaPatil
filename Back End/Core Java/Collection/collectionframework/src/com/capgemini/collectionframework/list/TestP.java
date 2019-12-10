package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestP {
public static void main(String[] args) {
	
	ArrayList<Student> al=new ArrayList<Student>();
	Student s1=new Student(1, "priya", 26.56);
	Student s2=new Student(2, "parag", 53.12);
	Student s3=new Student(3, "lila", 23.46);
	Student s4=new Student(4, "ojas", 56.23);
	Student s5=new Student(5, "baban", 46.56);

	
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	
	System.out.println("-------for loop------");
for (int i = 0; i <5; i++) {
	
	Student s=al.get(i);
	System.out.println("Id is "+s.id);
	System.out.println("Name is "+s.name);
	System.out.println("Percentage is "+s.percentage);
	System.out.println("****************************");
}
	
System.out.println("------------for each ---------");
for(Student s: al)
{
	
	System.out.println("Id is "+s.id);
	System.out.println("Name is "+s.name);
	System.out.println("Percentage is "+s.percentage);
	System.out.println("****************************");
}

System.out.println("-----------Iterator ---------");
Iterator<Student> li=al.iterator();
while(li.hasNext()) {
	Student s=li.next();
	System.out.println("Id is "+s.id);
	System.out.println("Name is "+s.name);
	System.out.println("Percentage is "+s.percentage);
	System.out.println("****************************");
}

System.out.println("-----------ListIterator ---------");
System.out.println("############# forward");
ListIterator<Student> lit=al.listIterator();
while(lit.hasNext()) {
	Student s=lit.next();
	System.out.println("Id is "+s.id);
	System.out.println("Name is "+s.name);
	System.out.println("Percentage is "+s.percentage);
	System.out.println("****************************");
}


System.out.println("###########backward");
ListIterator<Student> litt=al.listIterator();
while(litt.hasNext()) {
	Student s=litt.next();
	System.out.println("Id is "+s.id);
	System.out.println("Name is "+s.name);
	System.out.println("Percentage is "+s.percentage);
	System.out.println("****************************");
}



}}
