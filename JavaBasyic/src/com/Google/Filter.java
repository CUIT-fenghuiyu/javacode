package com.Google;

abstract class Filter {
	private String name;
	
	Filter(String name){
		this.name = name;
	}
	
	abstract public void doFilter();
}
