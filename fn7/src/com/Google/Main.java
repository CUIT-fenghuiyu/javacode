package com.Google;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thermometer t1 = new Thermometer();
        t1.switchUnit(); //t1改变温度单位
        Scanner scanner = new Scanner(System.in);
                //输入温度单位和温度值
        char unit = scanner.next().charAt(0);
        double temperature = scanner.nextDouble();
        System.out.printf("Thermometer t1's temperature is %.2f"+t1.getUnit()+"%n",t1.getTemperature());
        Thermometer t2 = new Thermometer(temperature,unit);
        System.out.printf("Thermometer t2's temperature is %.2f"+t2.getUnit()+"%n",t2.getTemperature());
        t2.switchUnit(); //t2改变温度单位
        System.out.printf("Thermometer t2's temperature is %.2f"+t2.getUnit()+"%n",t2.getTemperature());
    }
}