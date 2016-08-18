package com.tiy.ssa.weekthree.daytwo.Chess;

import com.tiy.ssa.weekone.assignmentFive.Location;

public class Queen implements Piece{

	Location locateQueen;

	public Queen (Location locateQueen){

		this.locateQueen = locateQueen;
	}

	@Override
	public int compareTo(Piece arg0) {
		if(this.getClass().equals(arg0.getClass())){
			int diff1 = (locateQueen.x + 4) + (locateQueen.y + 4) ;
			int diff2 = (arg0.where().x + 4) + (arg0.where().y + 4) ;
			if(diff1 > diff2)
				return 1;
			if(diff1 < diff2)
				return -1;
			return 0;
		}
		return (this.getVal() > arg0.getVal())? 1 : -1;

	}

	@Override
	public Location where() {
		return locateQueen;
	}

	@Override
	public boolean canMove(Location where) {
		if(where.equals(where()))
			return false;
		if(where.equals(where()))
			return false;
		if(locateQueen.x > top | locateQueen.x < bottom | locateQueen.y > top | locateQueen.y < bottom){
			return false;
		}
		int diffRow = Math.abs(where.x - this.locateQueen.x);
		int diffCol = Math.abs(where.y - this.locateQueen.y); 
		return (locateQueen.x == where.x | locateQueen.y == where.y | (diffRow == diffCol));

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locateQueen == null) ? 0 : locateQueen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Queen other = (Queen) obj;
		if (locateQueen == null) {
			if (other.locateQueen != null)
				return false;
		} else if (!locateQueen.equals(other.locateQueen))
			return false;
		return true;
	}

	@Override
	public int getVal() {
		return 4;
	}


}
