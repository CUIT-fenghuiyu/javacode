package com.Google;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Point originPoint = new Point();
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        Point point = new Point(x,y);
        System.out.println("The point's x is "+point.getX()+" and point's y is "+point.getY());
        System.out.printf("The distance from point to origin is:%.3f%n",point.calDistance(originPoint));
        point.moveTo(20,10);
        System.out.printf("After move,the distance from point to origin is:%.3f",point.calDistance(originPoint));
    }
}