package com.Google;

public class QuadraticEquation {
    private int a, b, c;

    QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public int getC(){
        return c;
    }

    public double getDiscriminant(){
        double dat = Math.pow(b,2) - 4*a*c;

        return dat;
    }

    double getRoot1(){
        if(getDiscriminant() >= 0){
            double x1 = ( (-1)*b + Math.pow(b*b-4*a*c, 0.5) ) / 2*a;

            return x1;
        }else {
            return 0;
        }
    }

    double getRoot2(){
        if(getDiscriminant() >= 0){
            double x2 = ( (-1)*b - Math.pow(b*b-4*a*c, 0.5) ) / 2*a;

            return x2;
        }else {
            return 0;
        }
    }
}
