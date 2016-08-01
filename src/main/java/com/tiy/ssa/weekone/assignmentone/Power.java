package com.tiy.ssa.weekone.assignmentone;

public class Power {

	private int intToMul;
	private int power;
	

	public Power() {
	}
	
	public Power(int intToMul){
		this.intToMul = intToMul;
		power = 1;
	}
	
	public Power(int intToMul, int power){
		this.intToMul = intToMul;
		this.power = power; 
	}

	public int raisedBy(int intToMul, int power){
		if(power == 1)
			return intToMul;
		return (intToMul) * raisedBy(intToMul, power -1);
	}
}

