package com.tiy.ssa.weekthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetorDefaultTest {

	@Test
	public void test() {
		GetorDefault<String, Integer> g1 = new GetorDefault<>();
		g1.add("Hello", 1);
		g1.add("Howareyou", 2);
		
		assertEquals("", Integer.valueOf(1), g1.getOrDefault("Hello", 1));
		
		
	}

}
