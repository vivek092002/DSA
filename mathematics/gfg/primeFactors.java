package com.DSA.mathematics.gfg;

public class primeFactors {
    public static void main(String[] args) {
        int n = 450;
        primeFact(n);
    }

    public static void primeFact(int n){
        if (n<=1){
            return;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            while (n%i==0){
                System.out.println(i);
                n = n/i;
            }
        }
        if (n>1){
            System.out.println(n);
        }
    }
}
