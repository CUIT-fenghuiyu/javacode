package com.Google;

import java.lang.reflect.Modifier;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.Google.Converter");
        Class<?> clazz2 = Class.forName("com.Google.WeightConverter");
        boolean isAbs = Modifier.isAbstract(clazz.getModifiers()) ;
        System.out.println(clazz.isAssignableFrom(clazz2)+" "+Modifier.isAbstract(clazz.getModifiers()));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入换算器名称(比如：斤-克)、原重量值和换算系数，中间用空格分开");
        String name = scanner.next();
        double value = scanner.nextDouble();
        double factor = scanner.nextDouble();
        WeightConverter converter = new WeightConverter(name,value,factor);
        String[] units = name.split("-");
        System.out.println(converter.getName()+"换算，"+converter.getValue()+units[0]+"="+converter.convert()+units[1]);
    }
}