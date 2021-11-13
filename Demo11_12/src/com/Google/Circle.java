package com.Google;

public class Circle extends Shape{
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    Circle(String name, int radius){
        super(name);
        if(radius < 0){
            this.radius = 0;
        }else{
            this.radius = radius;
        }
    }
}
