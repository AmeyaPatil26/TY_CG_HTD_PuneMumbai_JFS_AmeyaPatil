package com.capgemini.ArrayPrg.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestGen {

	public static void main(String[] args) {
		System.out.println("----aarraylist------");
		ArrayList al = new ArrayList();
		al.add('A');
		al.add('Y');
		al.add('M');
		al.add('E');
		System.out.println("Before------" + al);
		Collections.shuffle(al);
		System.out.println("after----" + al);

	}
	}


