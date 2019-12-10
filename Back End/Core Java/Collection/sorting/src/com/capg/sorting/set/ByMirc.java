package com.capg.sorting.set;

import java.util.Comparator;

public class ByMirc  implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		/*
		 * if(o1.micr >o2.micr) { return 1; }else if(o1.micr <o2.micr) { return -1; }
		 * else { return 0; }
		 */
	
		Long k=o1.micr;
		Long j=o2.micr;
		
		return k.compareTo(j);
	}
	

}
