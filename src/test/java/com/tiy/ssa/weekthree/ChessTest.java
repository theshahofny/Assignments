package com.tiy.ssa.weekthree;

import static org.junit.Assert.*;

import org.junit.Before;
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
	Piece king ;
	Piece queen;
	Piece rook ;
	Piece pawn;
	Piece knight;
	Piece bishop;

	@Before
	public void Setup() {

		king = new King(new Location(3,0));
		queen = new Queen(new Location(4,0));
		rook = new Rook(new Location(7,0));
		pawn = new Pawn(new Location(0,1));
		bishop = new Bishop(new Location(2,0));
		knight = new Knight(new Location(1,0));

	}

	@Test
	public void testforVal()
	{
		assertEquals("", 2, bishop.getVal());
		assertEquals("", 5, king.getVal());
		assertEquals("", 3, rook.getVal());
		assertEquals("", 2, knight.getVal());
		assertEquals("", 4, queen.getVal());

	}

	@Test
	public void testforCanMove(){

		assertFalse(queen.canMove(new Location(3,7)));
		assertFalse(queen.canMove(new Location(3,10)));
		assertTrue(queen.canMove(new Location(3,1)));
		assertTrue(queen.canMove(new Location(4,1)));

		assertTrue(king.canMove(new Location(2,1)));
		assertTrue(king.canMove(new Location(3,1)));
		assertFalse(king.canMove(new Location(5,0)));
		assertTrue(king.canMove(new Location(3,1)));

		assertTrue(bishop.canMove(new Location(4,2)));
		assertTrue(bishop.canMove(new Location(0,2)));
		assertFalse(bishop.canMove(new Location(0,1)));

		assertTrue(pawn.canMove(new Location(0,2)));
		assertFalse(pawn.canMove(new Location(1,1)));

		assertTrue(knight.canMove(new Location(2,2)));
		assertTrue(knight.canMove(new Location(0,2)));
		assertFalse(knight.canMove(new Location(2,1)));


	}

	@Test
	public void testforCompareTo(){
		
		assertEquals("", -1 ,knight.compareTo(king));
		assertEquals("", 1, king.compareTo(knight));
		assertEquals("", 0, king.compareTo(king));
		
		Piece king2 = new King(new Location(3,3));
		Piece king3 = new King(new Location(3,0));
		
		assertEquals("", 1, king2.compareTo(king));
		assertEquals("", -1, king.compareTo(king2));
		assertEquals("", 0, king.compareTo(king3));
		
		assertEquals("", -1, knight.compareTo(rook));
		assertEquals("", -1, knight.compareTo(queen));
		assertEquals("", -1, knight.compareTo(bishop)); //technically bishops location is closer to middle
		
		assertEquals("", 1, knight.compareTo(pawn));
		
		assertEquals("", 1, queen.compareTo(knight));
		assertEquals("", 1, queen.compareTo(pawn));
		assertEquals("", 1, queen.compareTo(bishop));
		assertEquals("", 1, queen.compareTo(rook));
		assertEquals("", -1, queen.compareTo(king3));
		assertEquals("", -1, queen.compareTo(king));
		
		assertEquals("", -1, pawn.compareTo(bishop));
		assertEquals("", -1, pawn.compareTo(knight));
		assertEquals("", -1, pawn.compareTo(rook));
		assertEquals("", -1, pawn.compareTo(king));
		assertEquals("", -1, pawn.compareTo(queen));
		assertEquals("", 0, pawn.compareTo(new Pawn(new Location(0,1))));
		
		assertFalse(bishop.canMove(bishop.where()));
		assertFalse(bishop.canMove(bishop.where()));
		assertFalse(bishop.canMove(bishop.where()));
		assertFalse(bishop.canMove(bishop.where()));
		assertFalse(bishop.canMove(bishop.where()));
		assertFalse(bishop.canMove(bishop.where()));
		
		}
}


