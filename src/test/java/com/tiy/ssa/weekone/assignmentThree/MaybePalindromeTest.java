package com.tiy.ssa.weekone.assignmentThree;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaybePalindromeTest {

	@Test
	public void test() {
		MaybePalindrome p1 = new MaybePalindrome("racecar");
		
		assertEquals("", true, p1.checkIfPalindrome());
		
		MaybePalindrome p2 = new MaybePalindrome("hello");
		
		assertEquals("", false, p2.checkIfPalindrome());
		
		MaybePalindrome p3 = new MaybePalindrome("Mom");
		assertEquals("", true, p3.checkIfPalindrome());
		
		System.out.println(p3.toString());
	}
	

}
