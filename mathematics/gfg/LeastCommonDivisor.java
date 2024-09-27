package com.DSA.mathematics.gfg;

public class LeastCommonDivisor {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        int res = LCM(a,b);
        System.out.println(res);
    }

    //Naive Solution
    public static int LCM(int a, int b){
        int res = Math.max(a,b);
        while (true){
            if ((res%a==0) && (res%b==0)){
                return res;
            }
            res++;
        }
    }

    //optimized solution
    public static int LCM2(int a,int b){
        return (a*b)/gcd(a,b);
    }
    static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
