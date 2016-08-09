package com.tiy.ssa.weektwo.assignmenttwo;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class HashCodeTests {

	@Test
	public void FooTest(){
		Set<Foo> f = new HashSet<>();
		assertTrue("", f.add(new Foo("Potato")));
		assertTrue("", f.add(new Foo("Potato")));
	}
	
	
	@Test 
	public void GooTest(){
		Set<Goo> f = new HashSet<>();
		assertTrue("", f.add( new Goo("Potatoe")));
		assertFalse("", f.add(new Goo("Potatoe")));
	}
}
