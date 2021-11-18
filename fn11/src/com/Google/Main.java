package com.Google;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz1 = Class.forName("com.Google.Filter");
        Class<?> clazz2 = Class.forName("com.Google.WordFilter");
        System.out.println(clazz1.isInterface()+" "+clazz1.isAssignableFrom(clazz2));
        System.out.println("������һ��Ӣ�ĵ��ʣ�");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        WordFilter filter = new WordFilter(input);
        System.out.println("ԭ�����ǣ�"+filter.getWord());
        filter.doFilter();
        System.out.println("���˴����"+filter.getWord());
        filter.setWord("programmING");
        System.out.println("ԭ�����ǣ�"+filter.getWord());
        filter.doFilter();
        System.out.println("���˴����"+filter.getWord());
    }
}
