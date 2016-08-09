package com.tiy.ssa.weektwo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.tiy.ssa.weektwo.assignmentone.Lists;

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
		//adding for test if list one has more than one elements
		
		this.philosophers.add("Plato");
		this.philosophers.add("Plato");
		
		
		this.mathematicians.add("Plato");
		this.mathematicians.add("Euclides");
//		this.mathematicians.add("Pythagoras");
//		this.mathematicians.add( "Descartes");
//		this.mathematicians.add( "Pascal");
		this.mathematicians.add("Plato");
	}
	
	
	@Test
	public void test() {
		List<String> larger = Arrays.asList("hi", "bye", "hi", "hi") ;
	       List<String> xtralarger = Arrays.asList("hi", "hello", "hi");
	       List<String> match = Lists.match(larger, xtralarger);
	       assertEquals("['hi']", 1, match.size()); //PASSES!!!
		
	       List<String> larger1 = Arrays.asList("hi", "bye", "hi", "hi", "hello", "goodbye", "bye!");
	       List<String> xtralarger1 = Arrays.asList("hi", "hello", "hi", "bye!");
	       List<String> match1 = Lists.match(larger1, xtralarger1);
	       assertEquals("['hi']", 3, match1.size()); //PASSES!!!
		
		assertEquals("", Arrays.asList(this.philosophers.get(3)), Lists.match(philosophers, mathematicians));
		assertEquals("", Arrays.asList(this.mathematicians.get(1), this.mathematicians.get(2),this.mathematicians.get(0)), Lists.descendingBySize(mathematicians));
	}
	
	@After
	public void clear(){
		
	}
	

}
