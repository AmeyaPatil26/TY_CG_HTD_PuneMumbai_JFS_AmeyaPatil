package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calculator = null;

	@BeforeEach
	public void createObject() {
		calculator = new Calculator();
	}//end of createObject()
	//here we create object before each testcase by using @beforeEach which resuse the code
	@Test
	public void testAdd() {
		int add = calculator.add(10, 20);
		assertEquals(30, add);
	}// end of testAdd()

	@Test
	public void testAddForNegative() {
		int add = calculator.add(10, -20);
		assertEquals(-10, add);
	}// end of testAddForNegative()

	@Test
	public void testSub() {
		int sub = calculator.sub(20, 10);
		assertEquals(10, sub);
	}

	@Test
	public void testDiv() {
		int div = calculator.div(20, 2);
		assertEquals(10, div);
	}// End of testDiv()

	@Test
	public void testDivByZero() {
		assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
	}// End of testDivByZero(0

	@Test
	public void testMul() {
		int mul = calculator.mul(10, 20);
		assertEquals(200, mul);
	}// End of testMul()

	@Test
	public void testMod() {
		int mod = calculator.mod(20, 10);
		assertEquals(0, mod);
	}// End of testMod()

}
