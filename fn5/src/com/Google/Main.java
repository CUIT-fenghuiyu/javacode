package com.Google;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        SimpleInteger n1 = new SimpleInteger(input1);
        SimpleInteger n2 = new SimpleInteger(input2);
        System.out.println("n1's value is "+n1.getValue());
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is odd? " + n1.isOdd());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("n1 equals n2? "+n1.equals(n2));
    }
}
