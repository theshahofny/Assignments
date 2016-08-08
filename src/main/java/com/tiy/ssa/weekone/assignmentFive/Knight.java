package com.tiy.ssa.weekone.assignmentFive;

import java.util.ArrayList;
//import java.util.Random;

public class Knight {

	//	private int[]row_moves = {2,-2,-1,1};
	//	private int[]column_moves ={2,-2,-1,1};

	ArrayList <Integer> moves = new ArrayList<>();

	//	private int[][] board = new int[8][8];
	final Location home;
	Location current;
	Location origin;

	public Knight(Location home){
		this.home = home;
		this.current = home;
	}


	public  Location move(){
		if(home())
			return this.origin = this.origin.offset(2,1);

		else{
			while(!home()){
			}
		}
		return current;
	}


	public boolean home(){
		return this.origin.equals(this.current);
	}

	public Location currently(){
		return this.current;
	}




}

