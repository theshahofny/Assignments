package com.tiy.ssa.weekone.assignmentThree;

public class PigLatin {

	public String translate (String sentence)
	{
		String[] a = sentence.split(" ");
		String result = "";
		int i = 0;
		while (i < a.length)
		{
			result += breakDown(a[i]);
			i++;
		}
		return result;
	}
	
	public boolean checkVowel(char check){
		char c = check;
		return "aeiouAEIOU".indexOf(c) >= 0;
	}
	
	private String breakDown(String word)
	{
		String result = "";
		if (checkVowel(word.toLowerCase().charAt(0)))
			result = word.toLowerCase() + "way ";
		else
			if (ifFirstTwoConsonants(word))
				result = word.toLowerCase().substring(2) +
				word.toLowerCase().substring(0,2) + "ay ";
			else
				result = word.toLowerCase().substring(1) + word.toLowerCase().charAt
				(0) + "ay ";
		return result;
	}

	private boolean ifFirstTwoConsonants(String word)
	{
		char a = word.charAt(0);
		char b = word.charAt(1);
		if(!checkVowel(a)) 
			if (!checkVowel(b))
				return true;
		return false;
	}



}
