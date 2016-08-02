package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		assertEquals("", 4, new Power().raisedBy(2,2));
		assertEquals("", 9, new Power().raisedBy(3,2));
		assertEquals("",.185, new Power().raisedBy(8, -2));
	}

}
