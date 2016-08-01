package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThermometerTest {

	@Test
	public void test() {
		assertEquals("", 26, new Thermometer(78, true).display(false));
		assertEquals("", 212, new Thermometer(414, true).display(false));
	}
	
	@Test
	public void integerDivision(){
		assertEquals("", 1.79, 9F/5, .01);
	}

	
}
