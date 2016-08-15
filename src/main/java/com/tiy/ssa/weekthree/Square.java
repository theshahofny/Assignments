package com.tiy.ssa.weekthree;

public class Square extends Rectangle {


	public Square(int side) {
		super(side,side);
	}

	@Override
	public void setHeight(int side){
		super.height = side;
		super.width = side;
	}
	
	@Override 
	public void setWidth(int side){
		setHeight(side);
	}
}
