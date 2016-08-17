package com.tiy.ssa.weekthree.daytwo.Chess;

import com.tiy.ssa.weekone.assignmentFive.Location;

public class Bishop implements Piece {

	Location locateBishop ;


	public Bishop(Location location) {
		this.locateBishop = location;
	}

	@Override
	public int compareTo(Piece arg0) {
		if(this.getClass().equals(arg0.getClass()) | (arg0.getClass() == Knight.class)){
			int diff1 = (locateBishop.x + 4) + (locateBishop.y + 4) ;
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
		return locateBishop;
	}

	@Override
	public boolean canMove(Location where) {
		if( locateBishop.x > Piece.top | locateBishop.x < Piece.bottom | locateBishop.y > Piece.top | locateBishop.y < Piece.bottom){
			return false;
		}
		int diffRow = Math.abs(where.x - this.locateBishop.x);
		int diffCol = Math.abs(where.y - this.locateBishop.y);

		if(diffRow == diffCol)
			return true;


		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locateBishop == null) ? 0 : locateBishop.hashCode());
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
		Bishop other = (Bishop) obj;
		if (locateBishop == null) {
			if (other.locateBishop != null)
				return false;
		} else if (!locateBishop.equals(other.locateBishop))
			return false;
		return true;
	}

	@Override
	public int getVal() {
		return 2;
	}



}
