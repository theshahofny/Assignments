package com.tiy.ssa.weekone.assignmentThree;

public class MaybePalindrome {

	private String checkThisString;
	private boolean isPalindrome;


	public MaybePalindrome(String supposedPalindrome){
		checkThisString = supposedPalindrome;
	}

	public boolean checkIfPalindrome(){
		return isPalindrome = checkThisString.replaceAll("[^A-Za-z]", "").equalsIgnoreCase(new StringBuilder(checkThisString).reverse().toString().replaceAll("[^A-Za-z]", ""));

	}


	@Override
	public String toString(){
		return checkThisString + (isPalindrome ? " is " : "is NOT " ) + "a palindrome";
	}
}
