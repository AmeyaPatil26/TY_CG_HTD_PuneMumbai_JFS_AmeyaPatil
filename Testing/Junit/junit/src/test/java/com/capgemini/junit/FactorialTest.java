package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	public void testFact() {
		Factorial fact = new Factorial();
		int a = fact.fact(5);
		assertEquals(120, a);
		
	}// End tesFact()
	@Test
	public void testFactForZero() {
		Factorial fact = new Factorial();
		int a = fact.fact(0);
		assertEquals(1, a);	
	}// End tesFactForZero()
	
	@Test
	public void testFactForNegative() {
		Factorial fact = new Factorial();
		int a = fact.fact(-6);
		assertEquals(1, a);	
	}// End tesFactForNegative()
	
}// End of testCase
