package com.DSA.mathematics.gfg;

//https://www.geeksforgeeks.org/numbers-exactly-3-divisors/
public class exactly3divisors {
    public static void main(String[] args) {
        int n = 6;
        int temp = exactly3Divisors(n);
        System.out.println(temp);
    }
    public static int exactly3Divisors(int N)
    {
        int count = 0;
        for (int i = 2; i < Math.sqrt(N); i++) {
            if (isPrime(i)){
                if (i*i <= N){
                    count++;
                }
            }
        }
        return count;
    }

    static boolean isPrime(int n){
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
