package com.Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Employee employee = null;
        int num = Integer.parseInt(in.nextLine());
        for (int i = 0; i < num; i++) {
            String str = in.nextLine();
            String[] data = str.split(",");
            employee = new Employee(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            empList.add(employee);
        }
        showResult(empList);
        in.close();
    } 

    public static void showResult(List<Employee> empList) {
        for (int i = 0; i < empList.size(); i++) {
            Person emp = empList.get(i);
            System.out.println("name:" + emp.getName() + ",age:" + emp.getAge() + ",income:" + emp.getAnnualIncome(12));
        }
    }
}

//开始抽象类Person和Employee类的定义


