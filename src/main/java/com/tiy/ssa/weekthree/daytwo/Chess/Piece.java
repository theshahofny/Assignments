package com.tiy.ssa.weekthree.daytwo.Chess;

import com.tiy.ssa.weekone.assignmentFive.Location;

public interface Piece extends Comparable <Piece> {
	
	final int top = 7;
	final int bottom  = 0;
	Location where();
	
	boolean canMove(Location where);
	
	@Override 
	String toString();

    @Override
    /**
     * chess pieces have an intrinsic 'value'
     * ordered descending:
     * King 5
     * Queen 4
     * Rook 3
     * Bishop/Knight (tied) 2
     * Pawn 1
     * 
     * in addition pieces have the same value can
     * be valued by their location relative to the 'center'
     * of the board (3, 3) . . . (4, 4)
     */
    public int compareTo(Piece o);

    /**
     * take into account intrinsic value and location
     * @param other
     * @return
     * 
     */
    
    public int getVal();
    
    @Override
    boolean equals(Object other);

    @Override
    public int hashCode();
    


}
