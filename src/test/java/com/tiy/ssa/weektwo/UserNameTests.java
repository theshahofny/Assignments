package com.tiy.ssa.weektwo;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tiy.ssa.weektwo.assignmenttwo.Name;
import com.tiy.ssa.weektwo.assignmenttwo.User;

public class UserNameTests {
	Set<User> people = new HashSet<>();

	@Before 
	public void setup(){

		people.add(new User("Jenny", "Craig", 45));
		people.add(new User("Ram", "Craig", 45));
		people.add(new User("Jenny", "Craig", 45));
		people.add(new User("Jen", "Craig", 43));
		people.add(new User("Ami", "Shah", 26));
		people.add(new User("Kavita", "S", 15));
		people.add(new User("Nicholas", "Ek", 5));
		people.add(new User("Nicholas", "Ek", 5));
		
	}

	@Test
	public void test() {
		Set<Name> children = new HashSet<>(children(people));
		assertEquals("", 2, children.size());

		float avgAge = adultAverageAge(people);
		assertEquals("", 39.75f, avgAge, .01);
	}

	static Collection<Name> children (Collection<? extends User> users){

		Set <Name> children = new HashSet<>();

		for(User age : users){
			if(age.getAge() <= 16)
				children.add(new Name(age.getFirstName(), age.getLastName()));		
		}
		return children;
	}

	static float adultAverageAge(Collection<? extends User> users){

		float total = 0, avg;
		int counter = 0; 

		for(User age : users){
			if(age.getAge() > 16){
				counter++;
				total += age.getAge();
			}
		}
		avg = total/counter;
		return avg;

	}
	
	@After
	public void cleanUp(){
		this.people.clear();
	}
}
