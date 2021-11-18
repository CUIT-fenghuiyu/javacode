package com.Google;

public abstract class Converter {
	private String name;
	
	String getName() {
		return name;
	}
	
	
	Converter(String name){
		this.name = name;
	}
	
	public abstract void convert();
}
