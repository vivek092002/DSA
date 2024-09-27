package com.DSA.mathematics.gfg;

public class GCD {
    public static void main(String[] args) {
        int a = 33;
        int b = 25;
        //int res = GreatestCD(a,b);
        //System.out.println(res);
        int res1 = GreatestCD2(a,b);
        System.out.println(res1);
    }

    //Naive Solution
    public static int GreatestCD(int a, int b){
        //between 100 and 200 gcd will be max as 100
        int res = Math.min(a,b);
        while (res>0){
            if ((a%res==0) && (b%res==0)){
                break;
            }
            res--;
        }
        return res;
    }

    //optimised solution
    public static int GreatestCD2(int a,int b){
        if (b==0){
            return a;
        }
        return GreatestCD2(b,a%b);
    }
}
