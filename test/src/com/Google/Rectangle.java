package com.Google;

public class Rectangle {
    private float width, length;

    public Rectangle(){
        this.width = 1.0F;
        this.length = 1.0F;
    }

    public Rectangle(float width, float length){
        this.width = width;
        this.length = length;
    }

    public void setWidth(float newWidth){
        this.width = newWidth;
    }

    public  void setLength(float newLength){
        this.length = newLength;
    }

    public float getWidth(){
        return width;
    }

    public float getLength(){
        return length;
    }

    public float getArea(){
        float area = width * length;

        return area;
    }

    public float getPerimeter(){
        float perimeter = (width + length) * 2;

        return perimeter;
    }
}
