package com.tiy.ssa.weekthree.daytwo.Chess;

import com.tiy.ssa.weekone.assignmentFive.Location;

public class Rook implements Piece {

	Location locateRook ;
	
	public Rook(Location location) {
		this.locateRook = location;
	}

	@Override
	public int compareTo(Piece arg0) {
		if(this.equals(arg0)){
			int diff1 = (locateRook.x + 4) + (locateRook.y + 4) ;
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
	public Location where(){
		
		return locateRook;
	}

	@Override
	public boolean canMove(Location where) {
		if( locateRook.x > Piece.top | locateRook.x < Piece.bottom | locateRook.y > Piece.top | locateRook.y < Piece.bottom){
			return false;
		}
		  if (where.x == this.locateRook.x | where.y == this.locateRook.y)
		        return true;
		    return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locateRook == null) ? 0 : locateRook.hashCode());
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
		Rook other = (Rook) obj;
		if (locateRook == null) {
			if (other.locateRook != null)
				return false;
		} else if (!locateRook.equals(other.locateRook))
			return false;
		return true;
	}
	
	@Override
	public int getVal() {
		return 3;
	}

}
