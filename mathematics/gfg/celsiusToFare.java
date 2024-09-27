package com.DSA.mathematics.gfg;

public class celsiusToFare {
    public static void main(String[] args) {
        int C = 100;
        double temp = cToF(C);
        System.out.println(temp);
    }
    public static double cToF(int C)
    {
        //Your code here
        double f = C*(9/5.0) + 32;
        return f;
    }
}
