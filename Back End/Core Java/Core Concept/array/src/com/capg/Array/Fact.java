package com.capg.Array;

interface Factorial{
	int  num(int a);
}
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial k=a-> {
			int f=1;
		for(int i=1;i<=a;i++)
		{
			f=f*i;
		}
		return f;
			
		};
		System.out.println(k.num(6));
	}

}
