package com.tiy.ssa.weektwo;

public class Philosopher extends Lists {

	private Nationality nationality; 
	private String name; 
	private final Era era;
	
	
//	public enum Nationality{
//		GREEK, GERMAN, ENGLISH;
//	}
//	
//	
	
	public Philosopher(Nationality nationality, String name, Era era) {
		this.nationality = nationality;
		this.name = name;
		this.era = era;
	}


	public Nationality getNationality() {
		return nationality;
	}


	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Era getEra() {
		return era;
	}

	
	
	
	

	
	
	
//	public Philosopher(String nationality, String name){
//		this.nationality = nationality;
//		this.name = name;
//	}
	
	
	
}
