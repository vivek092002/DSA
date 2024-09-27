package com.DSA.mathematics.gfg;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 30;
        SOE(n);
    }
    public static void SOE(int n){
        boolean prime[] = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        for (int i=2 ; i*i<=n ; i++){
            if (prime[i]){
                for (int j = i*i; j <= n ; j+=i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i]){
                System.out.println(i + " ");
            }
        }
    }
}
