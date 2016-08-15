package com.tiy.ssa.Ancestry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Registry 
{
	
	TreeMap <Person, Relationship> people = new TreeMap<>(); 
	
    public boolean add(Person person)
    {
		return false;
		
    }


    public Person progenitor(SocialSecurityNumber ssn)
    {
		
    	people.get();
    	return null;

    }


    public Person oldestLivingRelative(SocialSecurityNumber ssn)
    {
    	//go up, find one generation up relatives,
    	// if Alive 
    	// go up, find next generation up relatives,
    	// if alive, keep going until -> dead relaive found 
    	//return last from dead relative. 
    	
		return null;

    }
    public List<Person> ancestors(SocialSecurityNumber ssn)
    {
    	//take social secruity number, search on person, and 
    	//return all related relatives
		return null;

    }

    public List<Person> descendants(SocialSecurityNumber ssn)
    {
    	//take social security number
    	//search for person
    	//go down the generations until last child- node found 
		return null;

    }

    public Person youngestDescendant(SocialSecurityNumber one)
    {
    	//search youngest-lowest generation, find youngest
		return null;

    }
    public boolean areRelated(SocialSecurityNumber one, SocialSecurityNumber two)
    {
    	//take the two social secruity numbers 
    	//find relationship => if exists return true
		return false;

    }

    public Person get(SocialSecurityNumber ssn)
    {
    	
		return null;

    }

    public Relationship related(SocialSecurityNumber one, SocialSecurityNumber two)
    {
    	//searchs on two social secruity number and return relationship
		return null;

    }


    public static enum Relationship
    {
        PARENT, CHILD, GRANDPARENT, GRANDCHILD, COUSIN, SIBLING, NIBLING, AUNCLE, NONE, ;
    }
}