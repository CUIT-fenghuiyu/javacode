package com.Google;

public class Rectangle {
	private float length,width;
	
	Rectangle(){
		this.width = 0;
		this.length = 0;
	}
	
	Rectangle(float width, float length){
		this.width = width;
		this.length = length;
	}
	
	void setWidth(float width) {
		this.width = width;
	}
	void setLength(float length) {
		this.length = length;
	}
	
	float getWidth() {
		return width;
	}
	float getLength() {
		return length;
	}
	
	float getPerimeter() {
		return 2*(width+length);
	}
	float getArea() {
		return width*length;
	}
}
