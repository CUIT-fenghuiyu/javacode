package com.Google;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //ʵ����һ��StudentScoreTable����
        StudentScoreTable table = new StudentScoreTable();
            //�Ӽ�������ɼ����ݣ���ʽΪ��stuID#����  
            //һ������һ�У�ֱ�����룺!end!��ʾ�������
        Scanner sc = new Scanner(System.in);
        while (true){
            String input = sc.nextLine();
            if (input.equals("!end!")){
                break;
            }
            //�������ĳɼ�����
            String[] inputs = input.split("#");
            if (inputs.length != 2){
                break;
            }
           //����ֵ���������StudentScore���󣬲����뵽�ɼ����ĳɼ��б���
            StudentScore score = new StudentScore(inputs[0],Double.parseDouble(inputs[1]));
            table.add(score);
        }
        //������һ��ѧ�ţ�����ѧ�Ŵӳɼ����б��в�ѯ��Ӧ�ķ������������ѯ���
        String stuID = sc.next();
        StudentScore queryScore = table.findByStuID(stuID);
        if (queryScore == null){
            System.out.println("δ�ҵ���Ӧ�ĳɼ�����");
        }else{
            System.out.println("ѧ�ţ�"+stuID+"�ķ���Ϊ��"+queryScore.getScore());
        }

    }
}
