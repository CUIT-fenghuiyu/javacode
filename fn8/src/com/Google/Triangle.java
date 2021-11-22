package com.Google;

class Triangle extends Shape{
	double side1,side2,side3;
	
	Triangle(){
		super("°×É«");
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	Triangle(String color ,double side1, double side2, double side3){
		this.color = color;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	void setSide1(double side1){
		this.side1 = side1;
	}
	void setSide2(double side2){
		this.side2 = side2;
	}
	void setSide3(double side3){
		this.side3 = side3;
	}
	
	double getSide1(){
		return side1;
	}
	double getSide2(){
		return side2;
	}
	double getSide3(){
		return side3;
	}
	
	@Override
	double getArea() {
		double s = (side1 + side2 + side3)/2;
		if(s <= 0) {
			return 0.0;
		}else {
			return Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
		}
	}
	
	@Override
	public String toString() {
		return "Triangle: color = "+color+" side1 =  "+side1+ " side2 = " +side2+ " side3 = " + side3 +" area = " + getArea();
	}
	
}
