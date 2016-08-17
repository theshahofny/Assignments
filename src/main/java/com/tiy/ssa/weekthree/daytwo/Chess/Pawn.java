package com.tiy.ssa.weekthree.daytwo.Chess;

import com.tiy.ssa.weekone.assignmentFive.Location;

public class Pawn implements Piece {
	
	Location locatePawn;
	
	public Pawn(Location location) {
		this.locatePawn = location;
	}

	@Override
	public int compareTo(Piece arg0) {
		if(this.getClass().equals(arg0.getClass())){
			int diff1 = (locatePawn.x + 4) + (locatePawn.y + 4) ;
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
		return locatePawn;
	}

	@Override
	public boolean canMove(Location where) {
		if( locatePawn.x > top | locatePawn.x < bottom | locatePawn.y > top | locatePawn.y < bottom){
			return false;
		}
	    int diffRow = Math.abs(where.x - this.locatePawn.x);
	    int diffCol = Math.abs(where.y - this.locatePawn.y);
	    
	    if ((diffRow == 0 && diffCol == 1)) {
	        return true;
	    }
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locatePawn == null) ? 0 : locatePawn.hashCode());
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
		Pawn other = (Pawn) obj;
		if (locatePawn == null) {
			if (other.locatePawn != null)
				return false;
		} else if (!locatePawn.equals(other.locatePawn))
			return false;
		return true;
	}

	@Override
	public int getVal() {
		return 1;
	}

}
