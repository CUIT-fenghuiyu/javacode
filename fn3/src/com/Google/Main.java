package com.Google;


import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        System.out.println("equation discriminant is:"+(Math.pow(equation.getB(),2)-4*equation.getA()*equation.getC()));
        if (equation.getDiscriminant() < 0){
            System.out.println("The equation has no roots");
        }else{
            System.out.println("equation root1:"+equation.getRoot1());
            System.out.println("equation root2:"+equation.getRoot2());
        }

        QuadraticEquation equation1 = new QuadraticEquation(a1,b1,c1);
        System.out.println("equation1 discriminant is:"+(Math.pow(equation1.getB(),2)-4*equation1.getA()*equation1.getC()));
        if (equation1.getDiscriminant() < 0){
            System.out.println("The equation1 has no roots");
        }else{
            System.out.println("equation1 root1:"+equation1.getRoot1());
            System.out.println("equation1 root2:"+equation1.getRoot2());
        }
    }
}

/* 请在这里填写QuadraticEquation类的代码 */


