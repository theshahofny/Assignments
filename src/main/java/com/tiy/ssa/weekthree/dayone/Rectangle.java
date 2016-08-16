package com.tiy.ssa.weekthree.dayone;

public class Rectangle implements Shape {

	protected int width, height;
	

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth(){
		return this.width ;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float area() {
		return getHeight() * getWidth();
	}
	
	@Override
	public void setDimension(int dimension){
		
	}
}
