package com.DSA.recursion.gfg;

public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 10;
        int temp = getSum(n);
        System.out.println(temp);
    }
    static int getSum(int n){
        if (n == 0) {
            return 1;
        }

        return n+getSum(n-1);
    }
}
