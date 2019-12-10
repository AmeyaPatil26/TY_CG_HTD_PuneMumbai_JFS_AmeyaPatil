package com.capgemini.seleniumDemo2;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

	@Test
	public void addTest() {

		Calculator cal = new Calculator();
		int a = 10;
		int b = 20;
		int expected = 30;
		int actual = cal.add(a, b);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void subTest() {

		Calculator cal = new Calculator();
		int a = 30;
		int b = 10;
		int expected = 20;
		int actual = cal.sub(a, b);
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void mulTest() {
	Calculator cal = new Calculator();
	int a= 2;
	int b=10;
	int expected= 20;
	int actual = cal.mul(a,b);
	Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void divTest() {
	Calculator cal = new Calculator();
	int a= 10;
	int b=10;
	int expected= 1;
	int actual = cal.div(a, b);
	Assert.assertEquals(expected, actual);
	}
	
}
