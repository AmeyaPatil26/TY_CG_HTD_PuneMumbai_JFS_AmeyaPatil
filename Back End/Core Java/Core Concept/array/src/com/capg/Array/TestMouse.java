package com.capg.Array;

public class TestMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse m=new Mouse();
		System.out.println("double  type");
		double []b= {20.35,36.2};
		m.walk(b);
		System.out.println("int type");
		int []a= {10,20,30};
		m.run(a);

	}

}
