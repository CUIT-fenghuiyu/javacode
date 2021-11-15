package com.Google;

public class QuadraticEquation {
	private int a,b,c;
	
	QuadraticEquation(int a, int b, int c){
		this .a = a;
		this .b = b;
		this .c = c;
	}
	
	int getA() {
		return a;
	}
	
	int getB() {
		return b;
	}
	
	int getC() {
		return c;
	}
	
	int getDiscriminant() {
		if((b*b - 4*a*c) < 0) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	double getRoot1() {
		double x1;
		
		if((b*b - 4*a*c) >= 0) {
			x1 = (-b + Math.pow(b*b-4*a*c, 1.0/2)) / (2.0*a);
		}else {
			x1 = 0;
		}
		
		return x1;
	}
	
	double getRoot2() {
		double x2;
		
		if((b*b - 4*a*c) >= 0) {
			x2 = (-b - Math.pow(b*b-4*a*c, 1.0/2)) / (2.0*a);
		}else {
			x2 = 0;
		}
		
		return x2;
	}
	
}
