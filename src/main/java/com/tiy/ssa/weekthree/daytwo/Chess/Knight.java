package com.tiy.ssa.weekthree.daytwo.Chess;

import com.tiy.ssa.weekone.assignmentFive.Location;

public class Knight implements Piece {

	Location locateKnight ;


	public  Knight (Location locateKnight){
		this.locateKnight = locateKnight;
	}

	
	@Override
	public int compareTo(Piece arg0) {
		if((this.getClass().equals(arg0.getClass())) | (arg0.getClass() == Bishop.class)){
			int diff1 = (locateKnight.x + 4) + (locateKnight.y + 4) ;
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
		return locateKnight;
	}

	@Override
	public boolean canMove(Location where) {
		if(where.equals(where()))
			return false;
		if( locateKnight.x > top | locateKnight.x < bottom | locateKnight.y > top | locateKnight.y < bottom){
			return false;
		}
		int diffRow = Math.abs(where.x - this.locateKnight.x);
		int diffCol = Math.abs(where.y - this.locateKnight.y);

		if ((diffRow == 2 && diffCol == 1) || (diffRow == 1 && diffCol == 2)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locateKnight == null) ? 0 : locateKnight.hashCode());
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
		Knight other = (Knight) obj;
		if (locateKnight == null) {
			if (other.locateKnight != null)
				return false;
		} else if (!locateKnight.equals(other.locateKnight))
			return false;
		return true;
	}

	@Override
	public int getVal() {
		return 2;
	}


}
