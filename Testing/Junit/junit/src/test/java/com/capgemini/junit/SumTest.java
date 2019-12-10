package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	public void testAdd() {
		Sum s = new Sum();
		int i = s.add(10, 5);
		assertEquals(15, i); //it is used to compare expected result with actual result
		//if actual result and expected result are not match then it shows error 
		
		int j = s.add(10, 20, 10);
		assertEquals(40, j);
	}// End of testAdd()
	
}// End of testcase
