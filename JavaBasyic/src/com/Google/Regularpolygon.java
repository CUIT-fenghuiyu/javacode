package com.Google;

public class Regularpolygon {
	private int n;
	private double side;
	
	Regularpolygon(int n, double side){
		this.n = n;
		this.side = side;
	}
	
	double getArea(int n, double side) {
		if(n<3 || side<0) {
			return 0.0;
		}else {
			return (n*side*side)/(4*Math.tan(Math.PI/n));
		}
		
	}
}
