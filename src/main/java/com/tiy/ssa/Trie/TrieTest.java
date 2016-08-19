package com.tiy.ssa.Trie;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

public class TrieTest {

	Trie dictionary;

	@Before
	public void setup() throws Exception
	{
		dictionary = new Trie();
		BufferedReader reader = null;//creating a buffered reader
		try {
			reader = Files.newBufferedReader(Paths.get("C:/Users/admin/Downloads/corncob_lowercase.txt"),Charset.defaultCharset());//reading the file given by the default char set
			String line;
			while (null != (line = reader.readLine())) //setting line = to the reader on the line that it is on then adding words by triming each one in the line
			{ 
				this.dictionary.addWord(line.trim());
			}
		} catch (IOException iex) {
			System.err.println(iex);
		} finally {
			reader.close();
		}
	}
	
	@Test
	public void testTrie(){
		dictionary.getWords("eve");
	}

}
