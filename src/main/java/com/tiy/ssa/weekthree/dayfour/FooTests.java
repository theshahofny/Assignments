package com.tiy.ssa.weekthree.dayfour;

import java.time.LocalDate;

import org.junit.Test;

public class FooTests {

	@Test
	public void virtualDispath(){
		foo f = new foo();
		LocalDate now = LocalDate.now();
		f.foo(now);
		Object o = now;
		f.foo(o);

	}
}
