package com.Google;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.Google.Converter");
        Class<?> clazz2 = Class.forName("com.Google.CurrencyConverter");
        boolean isAbs = Modifier.isAbstract(clazz.getModifiers()) ;
        System.out.println(clazz.isAssignableFrom(clazz2)+" "+Modifier.isAbstract(clazz.getModifiers()));
        //输入开始
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入换算器名称、本币金额和汇率，中间用空格分开：");
        String name = scanner.next();
        double localCurrency = scanner.nextDouble();
        double exchangeRate = scanner.nextDouble();
        CurrencyConverter converter = new CurrencyConverter(name,localCurrency,exchangeRate);
        converter.convert();
        System.out.println(converter.getName()+"：本币："+converter.getLocalCurrency()+"，汇率："+converter.getExchangeRate()+"，外币："+converter.getForeignCurrency());
        converter.setExchangeRate(0.7);
        converter.convert();
        System.out.println(converter.getName()+"：本币："+converter.getLocalCurrency()+"，汇率："+converter.getExchangeRate()+"，外币："+converter.getForeignCurrency());
    }
}
