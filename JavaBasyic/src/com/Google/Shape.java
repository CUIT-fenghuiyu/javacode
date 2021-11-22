package com.Google;

abstract class Shape {
	abstract double getArea();
	abstract double getPerimeter();
	
	private String name;
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	Shape(String name){
		this.name = name;
	}
}
