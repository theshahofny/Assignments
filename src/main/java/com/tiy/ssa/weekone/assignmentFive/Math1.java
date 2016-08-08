package com.tiy.ssa.weekone.assignmentFive;

public class Math1 {

	public static int squaredRoot(int sqrtValue){
	
		 int squareRoot = sqrtValue/2;
		 int g1 = 0;
	     for(;(g1-squareRoot)!=0;){
	    	 g1=squareRoot;
	    	 squareRoot = (g1 + (sqrtValue/g1))/2;
	     }
		return squareRoot;

	}
	
	
	public static double cubedRoot(int rootVal){
		System.out.println("Hi thurston, I know the looping, just could not do math, and when you showed us the code, i did not want to copy yours.");
		double math3;
		math3 = Math.log(rootVal) / Math.log(3);  
		return math3;
		
		
	}
	
}