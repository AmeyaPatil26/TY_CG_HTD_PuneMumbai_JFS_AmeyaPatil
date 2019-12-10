package com.capg.string;

import java.util.HashSet;
import java.util.Set;

public class Tset1 {
	public static void main(String[] args) {
		Set  numsVar = new HashSet<String>();
		numsVar.add("5");
		numsVar.add(5);
		System.out.println(numsVar);
	}

}
