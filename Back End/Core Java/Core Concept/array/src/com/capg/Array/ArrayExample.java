package com.capg.Array;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayExample {
	public static void main(String[] args) {
		String [] a=new String[4];
		a[0]="vru";
		a[1]="omya";
		a[2]="jay";
		a[3]="pyrus";
		
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]);
		}
		
		
		int []b=new int[4];
		b[0]=12;
		b[1]=33;
		b[2]=56;
		b[3]=82;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println();
		
		int c[]= {3,9,2,5};
		for(int i=0;i<4;i++)
		{
			System.out.println(c[i]);
		}
		
		
		char ch[]= {'a','b','c','d'};
		for(char g: ch)
		{
			System.out.println(g);
		}

	}
	
	
}
