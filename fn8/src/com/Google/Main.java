package com.Google;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();  //测试父类无参构造器
        Shape t1 = new Triangle();   //测试继承关系
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        String color = sc.next();
        Shape shape1 = new Shape(color);   //测试父类带参数构造器
        Triangle t2 = new Triangle(color,side1,side2,side3);   //测试子类带参数构造器
        System.out.println("shape1's color is "+shape1.getColor() + ", area is "+shape1.getArea()); //测试父类的getColor方法和getArea方法
        System.out.println(t1.toString()); //测试子类重写的toString 方法
        System.out.println(t2.toString());//测试子类重写的toString 方法
        t2.setColor("红色");  //测试子类的setter方法
        t2.setSide1(10.0);
        t2.setSide2(10.0);
        t2.setSide3(10.0);
        System.out.println("Triangle t2'area is "+t2.getArea());  //测试子类的getArea方法

    }
}