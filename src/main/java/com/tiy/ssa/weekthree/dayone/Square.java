package com.tiy.ssa.weekthree.dayone;

public class Square extends Rectangle {


	final Rectangle rectangle;
	
	
	public Square(int dimension){
		
		this.rectangle = new Rectangle(dimension, dimension);
	}
	
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
