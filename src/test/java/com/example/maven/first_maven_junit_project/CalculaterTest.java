package com.example.maven.first_maven_junit_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculaterTest {
	Calculater calculater = new Calculater();

	@Test
	public void testAddition () {
		assertEquals(calculater.addition(4,4),8,0);
	}
	@Test
	public void testAddition2 () {
		assertEquals(calculater.addition(4,2),6,0);
	}

	@Test
	public void testSubtraction () {
		assertEquals(calculater.subtraction(4,2),2,0);
	}

	@Test
	public void testDivision () {
		assertEquals(calculater.division(4,2),2,0);
	}
	
	@Test
	public void testMultiplication() {
		assertEquals(calculater.multiplication(4,2),8,0);
	}

	
	
}
