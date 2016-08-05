package com.tiy.ssa.weekone.assignmentfourt;

import java.util.ArrayList;
import java.util.Random;

public class Knight {

	private int[] move = {-1, 2, -1, -2, 1, 2, 1, -2, -2, 1, -2, -1, 2, 1, 2, -1};
//	private int[]row_moves = {2,-2,-1,1};
//	private int[]column_moves ={2,-2,-1,1};
	
	ArrayList <Integer> moves = new ArrayList<>();
	
	private int[][] board = new int[8][8];
	Location home;
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


	public boolean isLastSpace(int row1, int c1, int row2, int c2){
		if(board[row1][c1]==board[row2][c2])
			return true;
		return true;
	}

	public boolean validMove(int row1, int c1, int row2, int c2) {
		for (int i = 0; i < move.length; i = i + 2) {
			if (row1 == row2 + move[i] && c1 == c2 + move[i + 1] )
				return true;
		}
		return false;
	}

}

