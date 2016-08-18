package com.tiy.ssa.weekthree.daytwo.Chess;

import com.tiy.ssa.weekone.assignmentFive.Location;

public class King implements Piece{

	Location locateKing;


	public King(Location locateKing){
		
		this.locateKing = locateKing;
	}

	@Override
	public int compareTo(Piece arg0) {

		if(this.getClass().equals(arg0.getClass())){
			int diff1 = (locateKing.x + 4) + (locateKing.y + 4) ;
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
		return locateKing;
	}

	@Override
	public boolean canMove(Location where) {
		if(where.equals(where()))
			return false;
		if( locateKing.x > top | locateKing.x < bottom | locateKing.y > top | locateKing.y < bottom){
			return false;
		}
		int diffRow = Math.abs(where.x - this.locateKing.x);
		int diffCol = Math.abs(where.y - this.locateKing.y);

		if ((diffRow == 1 && diffCol == 0) | (diffRow == 0 && diffCol == 1) | (diffRow == 1 && diffCol == 1))  {
			//can use Location.offSet(row, column) method if true to actually move the pieces;
			return true;
		}

		return false;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locateKing == null) ? 0 : locateKing.hashCode());
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
		King other = (King) obj;
		if (locateKing == null) {
			if (other.locateKing != null)
				return false;
		} else if (!locateKing.equals(other.locateKing))
			return false;
		return true;
	}

	@Override
	public int getVal() {
		return 5;
	}




}
