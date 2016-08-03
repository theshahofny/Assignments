package com.tiy.ssa.weekone.assignmentThree;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinTest {

	@Test
	public void test() {
		PigLatin pigSentence1 = new PigLatin();
		assertEquals("", "appyhay ", pigSentence1.translate("happy"));
		
		assertEquals("", "igpay atinlay isway ardhay otay eakspay ", pigSentence1.translate("Pig Latin is hard to speak"));
		
		assertEquals("", "ildchay ", pigSentence1.translate("child"));
		
		assertEquals("", "child22ay ", pigSentence1.translate("22child")); //would be nice to incorporate numbers?
		
		assertEquals("", "arcay ", pigSentence1.translate("car"));

	    
	    }
	}


