package com.Google;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thermometer t1 = new Thermometer();
        t1.switchUnit(); //t1�ı��¶ȵ�λ
        Scanner scanner = new Scanner(System.in);
                //�����¶ȵ�λ���¶�ֵ
        char unit = scanner.next().charAt(0);
        double temperature = scanner.nextDouble();
        System.out.printf("Thermometer t1's temperature is %.2f"+t1.getUnit()+"%n",t1.getTemperature());
        Thermometer t2 = new Thermometer(temperature,unit);
        System.out.printf("Thermometer t2's temperature is %.2f"+t2.getUnit()+"%n",t2.getTemperature());
        t2.switchUnit(); //t2�ı��¶ȵ�λ
        System.out.printf("Thermometer t2's temperature is %.2f"+t2.getUnit()+"%n",t2.getTemperature());
    }
}