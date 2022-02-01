package com.company;

public class Triangle {
    int a;
    int b;
    int c;
    public void area(){
        double s = (a+b+c)/2;
        System.out.println((int)Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}
