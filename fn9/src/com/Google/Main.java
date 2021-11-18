package com.Google;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Person person = new Person("Tom");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String stuID = scanner.next();
        Person stu1 = new Student(name,stuID);
        person.doSelfIntroduction();
        stu1.doSelfIntroduction();
        Student stu2 = new Student(name,stuID);
        stu2.study();
    }
}
