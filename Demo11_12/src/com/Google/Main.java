package com.Google;

import java.util.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        List<Circle> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Circle c = null;
        int num = Integer.parseInt(in.nextLine());
        for (int i = 0; i < num; i++) {
            String str = in.nextLine();
            String[] data = str.split(",");
            c = new Circle(data[0], Integer.parseInt(data[1]));
            list.add(c);
        }
        showResult(list);
        in.close();
    }

    public static void showResult(List<Circle> list) {
        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 0; i < list.size(); i++) {
            Shape c = list.get(i);
            System.out.println("name:" + c.getName() + ",Area:" + df.format(c.getArea()) + ",Perimeter:" + df.format(c.getPerimeter()));
        }
    }
}

//开始抽象类Shape和Circle类的定义

