package com.tiy.ssa.weekthree;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tiy.ssa.weekthree.daytwo.Chess.Knight;
import com.tiy.ssa.weekone.assignmentFive.Location;
import com.tiy.ssa.weekthree.daytwo.Chess.Bishop;
import com.tiy.ssa.weekthree.daytwo.Chess.King;
import com.tiy.ssa.weekthree.daytwo.Chess.Pawn;
import com.tiy.ssa.weekthree.daytwo.Chess.Piece;
import com.tiy.ssa.weekthree.daytwo.Chess.Queen;
import com.tiy.ssa.weekthree.daytwo.Chess.Rook;

public class ChessTest {

	@Test
	public void test() {
		
		Piece king = new King(new Location(3,0));
		Piece queen = new Queen(new Location(4,0));
		Piece rook = new Rook(new Location(7,0));
		Piece pawn = new Pawn(new Location(0,1));
		Piece bishop = new Bishop(new Location(2,0));
		Piece knight = new Knight(new Location(1,0));
		
		assertEquals("", true , king.canMove(new Location(2,1)));
		assertEquals("", 2, bishop.getVal());
		assertEquals("", 5, king.getVal());
		assertEquals("", 3, rook.getVal());
		assertEquals("", 2, knight.getVal());
		assertEquals("", 4, queen.getVal());
		
		
		assertEquals("", false , queen.canMove(new Location(3,10)));
		
		
		//COULD NOT WRITE MORE TESTS
		
	}

}
