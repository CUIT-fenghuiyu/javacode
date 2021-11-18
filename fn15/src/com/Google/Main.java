package com.Google;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        Rectangle rectangle = new Rectangle(width,length);
        System.out.print("Output:");
        System.out.print(rectangle.getArea()+" "+rectangle.getPerimeter());
    }
}

/* 请把Rectangle类的定义代码写在下面 */
