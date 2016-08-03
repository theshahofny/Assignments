package com.tiy.ssa.weekone.assignmentThree;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;


public class PrecisionBatteryTest {

	@Test
	public void test() {
			PrecisionBattery b1 = new PrecisionBattery(50.5f);
			
			b1.discharge(new BigDecimal("15.5"));
			
			assertTrue(b1.getLeftOver().compareTo( new BigDecimal("35")) == 0);
			
			assertEquals("Error in your expected, try the hours -> mins", 420f , b1.howLong(5f), 01);
			
			b1.charge(new BigDecimal("10")); 
			b1.discharge(new BigDecimal("20"));
			
	}

}

