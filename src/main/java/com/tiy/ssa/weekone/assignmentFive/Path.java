package com.tiy.ssa.weekone.assignmentFive;

import java.util.ArrayList;

public class Path {

	ArrayList<Integer> path = new ArrayList<>();

	public Path(Location x, Location y){

	}
	public void addPath(Location x, Location y){
		path.add(x.x);
		path.add(x.y);
		path.add(y.x);
		path.add(y.y);
	}

	public boolean isLastSpace(Path path){
		//if already exists in ArrayList 
		// was last Space
		//return true;
		return true;
	}






}
