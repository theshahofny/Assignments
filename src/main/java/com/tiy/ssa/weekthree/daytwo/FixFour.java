package com.tiy.ssa.weekthree.daytwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class FixFour<T> implements Iterator<T>, Iterable<T>{
	
	@Override 
	public boolean hasNext(){
		return next() != null;
	}
	
	@Override 
	public T next(){
		return null;
		
	}
	
	@Override 
	public Iterator<T> iterator(){
		Iterable.iterator();
	}

}
