package com.Google;

public class RegularPolygon {
	private int n;
	private double sideLength;
	
	RegularPolygon(){
		this.n = 3;
		this.sideLength =1.0;
	}
	
	RegularPolygon(int n, double sideLength){
		this.n = n;
		this.sideLength = sideLength;
	}
	
	void setN(int n) {
		this.n = n;
	}
	void setSide(double sideLength) {
		this.sideLength = sideLength;
	}
	
	int getN() {
		return n;
	}
	double getSide() {
		return sideLength;
	}
	
	double getPerimeter() {
		return n*sideLength;
	}
	
	double getArea() {
		double area;
		area = (n*Math.pow(sideLength, 2)) / (4*Math.tan(Math.PI/n));

		return area;
	}
}
