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

/* ���Rectangle��Ķ������д������ */
