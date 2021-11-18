package com.Google;

import java.lang.reflect.Modifier;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
            //��֤������Ķ����Ƿ����Ҫ��
            //**���������������Ƕ������ض����µģ������������ǰ���ϰ�·��**
        Class<?> clazz = Class.forName("com.Google.Converter");
        Class<?> clazz2 = Class.forName("com.Google.CurrencyConverter");
        boolean isAbs = Modifier.isAbstract(clazz.getModifiers()) ;
        System.out.println(clazz.isAssignableFrom(clazz2)+" "+Modifier.isAbstract(clazz.getModifiers()));
            //���뿪ʼ
        Scanner scanner = new Scanner(System.in);
        System.out.println("�����뻻�������ơ����ҽ��ͻ��ʣ��м��ÿո�ֿ���");
        String name = scanner.next();
        double localCurrency = scanner.nextDouble();
        double exchangeRate = scanner.nextDouble();
        CurrencyConverter converter = new CurrencyConverter(name,localCurrency,exchangeRate);
        converter.convert();
        System.out.println(converter.getName()+"�����ң�"+converter.getLocalCurrency()+"�����ʣ�"+converter.getExchangeRate()+"����ң�"+converter.getForeignCurrency());
        converter.setExchangeRate(0.7);
        converter.convert();
        System.out.println(converter.getName()+"�����ң�"+converter.getLocalCurrency()+"�����ʣ�"+converter.getExchangeRate()+"����ң�"+converter.getForeignCurrency());
    }
}