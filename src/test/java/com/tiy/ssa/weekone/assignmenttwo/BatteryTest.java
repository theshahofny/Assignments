package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.*;

public class BatteryTest {
//
//	@Before
//	public void changeLeftOver(){
//		assertEquals()
//	}
	@Test 
	public void testDrainCharge(){
		assertEquals("", 50f, new Battery(100f).drain(50f), .01);
		assertEquals("", 60f, new Battery(100f).drain(40f), 01);
		
		assertEquals("", 100f, new Battery(100f).charge(25f), .01);
		
		assertEquals("", 60f , new Battery(5f).howLong(5f), .01);
	}
	
	
	@Test
	public void testHowLong() {
		Battery b1 = new Battery(50f);
		b1.drain(10f);
		
		assertEquals("Error in your expected, try the hours -> mins", 0f , b1.howLong(0f), 01);
		
		b1.charge(10f); 
		b1.drain(50f);
		
		assertEquals("", 0f, b1.getLeftOver(), 01);
		
		assertEquals("", 0f, b1.howLong(5), 01);
	}
	

}
