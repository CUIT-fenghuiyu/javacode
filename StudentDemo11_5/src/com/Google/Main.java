package com.Google;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //实例化一个StudentScoreTable对象
        StudentScoreTable table = new StudentScoreTable();
        //从键盘输入成绩数据，格式为：stuID#分数
        //一条数据一行，直到输入：!end!表示输入结束
        Scanner sc = new Scanner(System.in);
        while (true){
            String input = sc.nextLine();
            if (input.equals("!end!")){
                break;
            }
            //拆分输入的成绩数据
            String[] inputs = input.split("#");
            if (inputs.length != 2){
                break;
            }
            //将拆分的数据生成StudentScore对象，并加入到成绩单的成绩列表中
            StudentScore score = new StudentScore(inputs[0],Double.parseDouble(inputs[1]));
            table.add(score);
        }
        //再输入一个学号，按该学号从成绩单列表中查询对应的分数，并输出查询结果
        String stuID = sc.next();
        StudentScore queryScore = table.findByStuID(stuID);
        if (queryScore == null){
            System.out.println("未找到对应的成绩数据");
        }else{
            System.out.println("学号："+stuID+"的分数为："+queryScore.getScore());
        }

    }
}