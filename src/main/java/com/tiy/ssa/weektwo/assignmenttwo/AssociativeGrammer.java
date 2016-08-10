package com.tiy.ssa.weektwo.assignmenttwo;

public class AssociativeGrammer {
	
	private String input; 
	
	public enum State{
		LParen,
		RParen,
		RBracket,
		LBracket,
		RCurlyBracket,
		LCurlyBracket,
	}
	
	public AssociativeGrammer(String originalInput){
		this.input = originalInput;
	}

	public String getSource(){
		
		return this.input;
	}

	/**
	  @param operator - one of '(', '{', '[', ')', '}', ']' - any other value is illegal
	* @return the 'program'
	*/
	public String addOperator(char operator){
		char[] a = this.input.toCharArray();
		
		return null;
		
	}

	/**
	*  @return whether the 'program' is valid
	*/
	public boolean compiles(){
		return false;
		
	}
	
}
