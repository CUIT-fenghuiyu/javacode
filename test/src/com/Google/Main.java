package com.Google;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                double PI=0;
                double sum=0;
                for(int i=10000; i<=100000; i+=10000)
                {
                        for(int j=1; j<=i; j++)
                        {
                                sum += Math.pow(-1,j+1) / (2*j-1);
                        }
                        PI = 4*sum;
                        sum = 0;
                        System.out.println(PI);
                }
                sc.close();
        }
}