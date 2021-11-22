package com.Google;

public class Point {
	private double x,y;
	
	Point(){
		this.x = 0;
		this.y = 0;
	}
	
	Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	void setX(double x) {
		this.x = x;
	}
	void setY(double y) {
		this.y = y;
	}
	
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	
	void move(Point target) {
		this.x = target.getX();
		this.y = target.getY();
	}
	
	double calDistance(Point target) {
		double distance;
		
		distance = Math.pow(Math.pow(x-target.x, 2) + Math.pow(y-target.y, 2), 0.5);
		
		return distance;
	}
	
}
