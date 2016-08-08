package com.tiy.ssa.weektwo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;


public class ListsTest {
	
//	List<Philosopher> philosophers = new ArrayList<>();
//	List<Mathematicians> mathematicians = new ArrayList<>();

	List<String> philosophers = new ArrayList<>();
	List<String> mathematicians = new ArrayList<>();
	
	@Before
	public void setup(){

		
		
		this.philosophers.add("Socrates");
		this.philosophers.add("Luther");
		this.philosophers.add("Aristotle");
		this.philosophers.add("Plato");
		this.philosophers.add( "Aristo");
		
		
		
		this.mathematicians.add("Plato");
		this.mathematicians.add("Euclides");
//		this.mathematicians.add("Pythagoras");
//		this.mathematicians.add( "Descartes");
//		this.mathematicians.add( "Pascal");
		this.mathematicians.add("Plato");
	}
	
	
	@Test
	public void test() {
		assertEquals("", Arrays.asList(this.philosophers.get(3)), Lists.match(philosophers, mathematicians));
		assertEquals("", Arrays.asList(this.mathematicians.get(1), this.mathematicians.get(2),this.mathematicians.get(0)), Lists.descendingBySize(mathematicians));
	}
	
	@After
	public void clear(){
		
	}
	

}
