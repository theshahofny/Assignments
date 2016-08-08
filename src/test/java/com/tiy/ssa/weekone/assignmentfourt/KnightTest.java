package com.tiy.ssa.weekone.assignmentfourt;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tiy.ssa.weekone.assignmentFive.*;

public class KnightTest {

	public boolean validMove(int row1, int c1, int row2, int c2) {
		int[] move = {-1, 2, -1, -2, 1, 2, 1, -2, -2, 1, -2, -1, 2, 1, 2, -1};
		for (int i = 0; i < move.length; i = i + 2) {
			if (row1 == row2 + move[i] && c1 == c2 + move[i + 1] )
				return true;
		}
		return false;
	}

	// change ^ to public boolean validMove(Location x, Location y){

	@Test
	public void test() {
		Knight k1 = new Knight(new Location(0,1));
		assertEquals("", true , validMove(0, 0, 1, 2));

		Location prior = k1.currently();
		Location latter = k1.move();

		Path firstMove = null;
		int moves = 0;
		do{
			assertTrue("", validMove(prior.x, prior.y, latter.x, latter.y));
			if(null == firstMove)
				firstMove = new Path(prior, latter);
			else
				assertFalse("", firstMove.isLastSpace(new Path(prior, latter)));
			prior = latter;
		} while(moves++ <4 && ! k1.home());
		assertEquals("", 4, moves);

	}

}
