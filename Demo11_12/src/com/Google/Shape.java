package com.Google;

abstract class Shape {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Shape(String name){
        this.name = name;
    }
    abstract double getArea();
    abstract double getPerimeter();

}
