package com.Google;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long elapsedTime = scanner.nextLong();
        Time time1 = new Time(23,12,12);
        System.out.println("time1ʱ��: " + time1.getHour() + "ʱ:" +
                time1.getMinute() + "��:" + time1.getSecond()+"��");
        Time time2 = new Time();
        time2.setTime(elapsedTime);
        System.out.println("time2ʱ��: " + time2.getHour() + "ʱ:" +
                time2.getMinute() + "��:" + time2.getSecond()+"��");
    }
}