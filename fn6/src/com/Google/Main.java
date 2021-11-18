package com.Google;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long elapsedTime = scanner.nextLong();
        Time time1 = new Time(23,12,12);
        System.out.println("time1时间: " + time1.getHour() + "时:" +
                time1.getMinute() + "分:" + time1.getSecond()+"秒");
        Time time2 = new Time();
        time2.setTime(elapsedTime);
        System.out.println("time2时间: " + time2.getHour() + "时:" +
                time2.getMinute() + "分:" + time2.getSecond()+"秒");
    }
}