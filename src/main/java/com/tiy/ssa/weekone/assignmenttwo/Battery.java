package com.tiy.ssa.weekone.assignmenttwo;

import java.util.Random;

public class Battery {

	final float capacity; 
	float leftOver;

	public Battery(float capacity){
		capacity = (capacity < 0) ? Math.abs(capacity) : capacity; // if negative capacity added
		this.capacity = capacity;
		this.leftOver = capacity;
	}

	public float getCapacity() {
		return capacity;
	}

	public float getLeftOver() {
		return leftOver;
	}

	public float drain(float capacity){
		capacity = (capacity <= leftOver && this.capacity >= capacity) ? (this.capacity - capacity) : 0;
		updateLeftOver(capacity); 
		return capacity;
	}

	public float charge(float capacity){	
		capacity = (capacity <= (this.capacity - leftOver)) ? this.capacity + capacity : this.capacity;
		updateLeftOver(capacity); 
		return capacity;
	}

	private void updateLeftOver(float leftOver){
		this.leftOver = leftOver;
	}

	public float howLong(float power){  //RETURNS MINUTES
	return power = (power > 0 ) ? (leftOver / (power )) * 60 : 0;	
	}
	
}
