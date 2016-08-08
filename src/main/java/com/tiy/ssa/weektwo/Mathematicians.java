package com.tiy.ssa.weektwo;

public class Mathematicians extends Lists{
	private Nationality nationality; 
	private String name; 
	private final Era era;
	
	
//	public enum Nationality{
//		GREEK, GERMAN, ENGLISH, ITALIAN;
//	}
//

	public Mathematicians(Nationality nationality, String name, Era era) {
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
	
	
	
	
	
}
