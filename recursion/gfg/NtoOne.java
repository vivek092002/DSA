package com.DSA.recursion.gfg;

public class NtoOne {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }

    static void print(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
