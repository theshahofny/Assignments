package com.tiy.ssa.weektwo;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PhilosopherTest {


	List<Philosopher> philosophers = new ArrayList<>();


	@Before
	public void setup(){
		this.philosophers.add(new Philosopher(Nationality.GREEK, "Socrates", new Era(1020, 1205)));
		this.philosophers.add(new Philosopher(Nationality.GERMAN, "Luther", new Era(1000, 1450)));
		this.philosophers.add(new Philosopher(Nationality.GREEK, "Aristotle", new Era(1700, 1100)));
		this.philosophers.add(new Philosopher(Nationality.GERMAN, "Plato", new Era(1550, 1205)));
		this.philosophers.add(new Philosopher(Nationality.ENGLISH, "Aristo", new Era(1022, 1215)));
	}
	
	@Test
	public void filter() {
		
	//	assertEquals("",  , oneNationality.stream().filter(p => p.getName().equals("Plato").count()));	
		
		
	//	assertEquals("", , philosophers. );
		
		//<List> Philosophers = new ArrayLIst
		
		assertEquals("", Arrays.asList(this.philosophers.get(1), this.philosophers.get(3)), nationalityFinder(Nationality.GERMAN));
		assertEquals("", 5, philosophers.size());
		assertEquals("", Nationality.GREEK, philosophers.get(0).getNationality());
	}
	
	List<Philosopher> nationalityFinder(Nationality nation){
		List<Philosopher> oneNationality = new ArrayList<>();
		for(Philosopher philos : this.philosophers){
			if(nation == philos.getNationality())
				oneNationality.add(philos);
		}
		return oneNationality;
	}

	List<Philosopher> nationalityDefinder(Nationality nation){

		List<Philosopher> diffNationality = new ArrayList<>();
		for(Philosopher philos : this.philosophers){
			if(nation != philos.getNationality())
				diffNationality.add(philos);
		}
		return diffNationality;
	}
	
	@After 
	public void clear(){
		this.philosophers.clear();
	}
}
