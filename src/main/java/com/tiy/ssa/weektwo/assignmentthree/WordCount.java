package com.tiy.ssa.weektwo.assignmentthree;


import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;


public class WordCount {

	Map<String,Integer> wordCount = new HashMap<>();
	String createOriginalString = "";

	public void addWord(String word)
	{
		
		createOriginalString += word + " ";
		boolean checkWord = wordCount.containsKey(word);
		if(checkWord){
			Integer increment = wordCount.get(word);
			increment ++;
			wordCount.put(word, increment);
		}
		else{
			wordCount.put(word, 1);
		}
	}

	public int count(String word)
	{
		return wordCount.get(word);

	}

	public List<String> top(int many)
	{

		List<String> topMany =
				wordCount.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(many)
				.map(Map.Entry::getKey).collect(Collectors.toList());

		return topMany;
	}

	public List<String> bottom(int many)
	{
		List<String> bottomMany =
				wordCount.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
				.limit(many)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		
		return bottomMany;

	}


	public String source()
	{
		return createOriginalString;
	}

}
