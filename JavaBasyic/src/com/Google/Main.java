package com.Google;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz1 = Class.forName("com.Google.Converter");
        Class<?> clazz2 = Class.forName("com.Google.ForeignExchangeAccount");
        System.out.println(clazz1.isInterface()+" "+clazz1.isAssignableFrom(clazz2));
        Scanner scanner = new Scanner(System.in);
        System.out.println("����������˻��ı���,���ʺͿ�������ı��ҽ��м��ÿո�");
        String currency = scanner.next();
        double exchangeRate = scanner.nextDouble();
        double balance = scanner.nextDouble();
        ForeignExchangeAccount account = new ForeignExchangeAccount(currency,exchangeRate,balance);
        account.convert();
        System.out.println(account.getCurrency()+"�˻������ʣ�"+account.getExchangeRate()+"��������"+account.getLocalCurrencyBalance()+"�������"+account.getForeignCurrencyBalance());
        account.setExchangeRate(0.71);
        account.convert();
        System.out.println(account.getCurrency()+"�˻������ʣ�"+account.getExchangeRate()+"��������"+account.getLocalCurrencyBalance()+"�������"+account.getForeignCurrencyBalance());
    }
}