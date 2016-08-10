package com.tiy.ssa.weektwo.assignmentthree;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class SocialSecurityNumberTests {

	@Test
	public void inital() {
	
		Map<SocialSecurityNumber, User> map = new HashMap<>();
		User user = new User("Aristotle", "Plato");
		map.put(new SocialSecurityNumber("986784456"),  user);
		assertEquals("", new User("Aristotle", "Plato"), map.get(new SocialSecurityNumber("986784456")));
		
		User removed = map.remove(new SocialSecurityNumber("986784456"));
		assertEquals("", user, removed);
		//assertEquals("", user, map.get(new SocialSecurityNumber("986784456")));
		
		//for(Entry entry: map.entrySet()){}
	
	}

	@Test
	public void myOwnTests(){
		Map<SocialSecurityNumber, User> map = new HashMap<>();
		User user = new User("Amy", "Burke", 37);
		map.put(new SocialSecurityNumber("000000000"), user);
		
		assertEquals("", 1, map.size());
		
		map.putIfAbsent(new SocialSecurityNumber("000000000"), new User("David", "The Thinker", 1050));
		System.out.println(map.get("000000000"));
		assertEquals("", map.get(user) , map.get("000000000"));
		
		assertEquals("", 1, map.size());
		for(Entry entry: map.entrySet()){
			System.out.println(map.entrySet());
		}
	}
	
	
	@Test
	public void stringshash(){
		System.err.println("horse".hashCode());
		System.err.println("hoarse".hashCode());
	}
}
