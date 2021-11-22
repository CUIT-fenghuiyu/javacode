package com.Google;

public class Square extends Shape{
	private int width;
	
	void setWidth(int width) {
		this.width = width;
	}
	int getWidth() {
		return width;
	}
	
	Square(String name, int width){
		super(name);
		if(width < 0) {
			this.width = 0;
		}else {
			this.width = width;
		}
	}
	
	@Override
	double getArea() {
		return width*width;
	}
	
	@Override
	double getPerimeter() {
		return 4*width;
	}
}
