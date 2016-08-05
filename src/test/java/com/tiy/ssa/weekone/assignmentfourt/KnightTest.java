package com.tiy.ssa.weekone.assignmentfourt;

import static org.junit.Assert.*;

import org.junit.Test;

public class KnightTest {
// have the isValid method here rather than in knight class
	
	@Test
	public void test() {
		Knight k1 = new Knight(new Location(0,1));
		assertEquals("", true , k1.validMove(0, 0, 1, 2));
		
		Location latter = Knight.move();
		Path firstMove = null;
		int moves = 0;
		do{
		
		assertTrue("", validMove(prior, latter));
		if(null == firstMove)
			firstMove = new Path(prior, latter);
		}
		else
			assertFlase("", firstMove.isRetrace(new Path(prior, latter)));
		prior = latter;
	}while(moves++ <4 && ! knight.home());
	assertEquals("", 4, moves);
	
	}

}
