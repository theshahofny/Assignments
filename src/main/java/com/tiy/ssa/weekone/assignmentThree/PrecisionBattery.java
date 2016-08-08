package com.tiy.ssa.weekone.assignmentThree;

import java.math.BigDecimal;

public class PrecisionBattery {

	BigDecimal capacity ;
	BigDecimal leftOver ;

	public PrecisionBattery(float capacity){
		this.capacity = new BigDecimal(capacity);
		this.leftOver = new BigDecimal(capacity);
	}

	public BigDecimal getCapacity(){
		return capacity;
	}

	public BigDecimal getLeftOver() {
		return leftOver;
	}
	public BigDecimal discharge(BigDecimal energy){
		return leftOver = (energy.compareTo(leftOver) == -1) ? (this.leftOver.subtract(energy)) : BigDecimal.ZERO;
	}

	public BigDecimal charge(BigDecimal energy){
		return leftOver= (energy.compareTo(this.leftOver.subtract(leftOver)) == -1) ? leftOver.add(energy) : capacity; 
	}

	public float howLong(float power){
		return power = (power > 0) ? ((this.leftOver.floatValue() / power) * 60) : 0;
	}

}
