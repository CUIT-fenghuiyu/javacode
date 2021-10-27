package com.Google;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz1 = Class.forName("com.Google.Filter");
        Class<?> clazz2 = Class.forName("com.Google.WordFilter");
        System.out.println(clazz1.isInterface()+" "+clazz1.isAssignableFrom(clazz2));
        System.out.println("请输入一个英文单词：");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        WordFilter filter = new WordFilter(input);
        System.out.println("原单词是："+filter.getWord());
        filter.doFilter();
        System.out.println("过滤处理后："+filter.getWord());
        filter.setWord("programmING");
        System.out.println("原单词是："+filter.getWord());
        filter.doFilter();
        System.out.println("过滤处理后："+filter.getWord());
    }
}
