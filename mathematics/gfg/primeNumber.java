package com.DSA.mathematics.gfg;

public class primeNumber {
    public static void main(String[] args) {
        int n = 35;
        boolean temp = isPrime1(n);
        System.out.println(temp);
    }

    //Naive Solution
    public static boolean isPrime(int n){

        //if number is one
        if (n==1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;

    }

    //optimised solution
    public static boolean isPrime1(int n){
        if (n==1){
            return false;
        }
        if (n==2 || n==3){
            return true;
        }

        if (n%2==0 || n%3==0){
            return false;
        }

        for (int i = 5; i*i <= n; i=i+5) {
            if (n%i==0 || n%(i+2) == 0){
                return false;
            }
        }
        return true;
    }
}
