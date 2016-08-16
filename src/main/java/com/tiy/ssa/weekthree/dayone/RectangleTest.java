package com.tiy.ssa.weekthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void squaretest() {
		Square sq1 = new Square(5);
		assertEquals("", 25.0 ,sq1.area(), .01);
		
		
		sq1.setWidth(9);
		assertEquals("", 81, sq1.area(), .01);
		
		sq1.setHeight(10);
		assertEquals("", 100, sq1.area(), .01);
	}

	@Test
	public void recTest(){
		Rectangle r1 = new Rectangle (2,5);
		assertEquals("", 10.0 , r1.area(), .01);
		
		r1.setHeight(r1.getHeight() * 2);
		assertEquals("", 20.0 , r1.area(), .01);
		
	}
}
