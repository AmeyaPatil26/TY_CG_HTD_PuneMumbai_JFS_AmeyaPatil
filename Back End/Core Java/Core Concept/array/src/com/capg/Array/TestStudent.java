package com.capg.Array;

public class TestStudent {

	public static void main(String[] args) {
  Student []st=new Student[4];
  Student s1=new Student(1,"ram",53.12);
  Student s2=new Student(2,"jfg",23.56);
  Student s3=new Student(3,"fgh",50.12);
  Student s4=new Student(4,"ajlf",55.52);
  
  st[0]=s1;
  st[1]=s2;
st[2]=s3;
st[3]=s4;

recive(st);
}
	
	public static void recive(Student []ar) {
		for(Student k: ar)
		{
			System.out.println(k.id);
			System.out.println(k.name);
			System.out.println(k.percentage);
			System.out.println("------------");
		}
	}

}
