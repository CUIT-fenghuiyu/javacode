package com.Google;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();  //���Ը����޲ι�����
        Shape t1 = new Triangle();   //���Լ̳й�ϵ
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        String color = sc.next();
        Shape shape1 = new Shape(color);   //���Ը��������������
        Triangle t2 = new Triangle(color,side1,side2,side3);   //�������������������
        System.out.println("shape1's color is "+shape1.getColor() + ", area is "+shape1.getArea()); //���Ը����getColor������getArea����
        System.out.println(t1.toString()); //����������д��toString ����
        System.out.println(t2.toString());//����������д��toString ����
        t2.setColor("��ɫ");  //���������setter����
        t2.setSide1(10.0);
        t2.setSide2(10.0);
        t2.setSide3(10.0);
        System.out.println("Triangle t2'area is "+t2.getArea());  //���������getArea����

    }
}