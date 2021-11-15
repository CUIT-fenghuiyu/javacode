package com.Google;

public class Point {
	private double x,y;
	
	Point(){
		this.x = 0;
		this.y = 0;
	}
	
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		
		return y;
	}
	
	void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	double calDistance(Point target){
		double x0 = target.x;
		double y0 = target.y;
		double distance;
		
		distance = Math.abs(Math.pow(Math.pow(x-x0, 2) + Math.pow(y-y0, 2), 0.5));
		return distance;
	}
}
