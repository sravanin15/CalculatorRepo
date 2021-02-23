package com.mindtree.Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	private static Calculator cal;
	@Test
	public void addTest() {
		
		int result=cal.add(3,2);
		assertEquals(5,result);
		
	}
	@Test
	public void subTest() {
		
		int result=cal.sub(3,2);
		assertEquals(1,result);
		
	}
	
}
