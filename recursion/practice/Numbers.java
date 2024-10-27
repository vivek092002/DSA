package com.DSA.recursion.practice;

public class Numbers {
    public static void main(String[] args) {
        Print(10);
    }
    public static void Print(int n){
        System.out.println(n);
        Print2(20);
    }

    private static void Print2(int n) {
        System.out.println(n);
        Print3(30);
    }
    public static void Print3(int n){
        System.out.println(n);
        Print4(20);
    }

    public static void Print4(int n){
        System.out.println(n);
    }
}
