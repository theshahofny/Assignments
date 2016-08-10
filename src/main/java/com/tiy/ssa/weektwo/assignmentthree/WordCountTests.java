package com.tiy.ssa.weektwo.assignmentthree;

import static org.junit.Assert.*;


import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class WordCountTests
{
	static String SOURCE = "The basic rule of thumb with paragraphing is to keep one idea to one paragraph. one, one, one, thumb.";
	static String SOURCE1 = "Hello! Goodbye! How How! are are are you you?";
	//static String SOURCE = "one";
	String[] words = SOURCE.split("\\W+"); 
	WordCount wordCount;
	
	@Before
	public void parse()
	{
		wordCount = new WordCount();
	    for (String word : words)
	    {
	        this.wordCount.addWord(word);
	    }
	
	}

	@Test
	public void test(){
		int x = 5;

		List<String> checker = (wordCount.top(x));
		assertTrue(checker.size() <= x);
		assertEquals("", "one", checker.get(0));
		System.out.println(wordCount.source());
		
		//
//		List<String> checker2 = new ArrayList<>(wordCount.top(2));
//		assertEquals("", 2 , checker2.size());
//		assertEquals("", "How", checker2.get(0));
//		assertEquals("", "are", checker2.get(1));
	}
}