package com.Google;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz1 = Class.forName("com.Google.Filter");
        Class<?> clazz2 = Class.forName("com.Google.UnicodeFilter");
        System.out.println(clazz1.isInterface()+" "+clazz1.isAssignableFrom(clazz2));
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        UnicodeFilter filter = new UnicodeFilter(input);
        System.out.println("原字符串是："+filter.getValue());
        filter.doFilter();
        System.out.println("字符串的Unicode码是："+filter.getValue());
    }
}