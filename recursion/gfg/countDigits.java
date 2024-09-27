package com.DSA.recursion.gfg;

public class countDigits {
    public static void main(String[] args) {
        int n = 99999;
        System.out.println(count(n));
    }
    //for counting the digits
    static int count(int n){
        if (n/10 == 0){
            return 1;
        }
        return 1 + count(n/10);
    }
}
