package com.DSA.recursion.gfg;

public class RopeCuttingProblem {
    public static void main(String[] args) {
        int n = 23;
        int a = 12;
        int b = 14;
        int c = 11;
        int temp = maxPiece(n,a,b,c);
        System.out.println(temp);
    }

    static int maxPiece(int n, int a, int b, int c){
        if (n==0){
            return 0;
        }
        if (n<0){
            return -1;
        }

        int res = Math.max(Math.max(maxPiece(n-a,a,b,c),maxPiece(n-b,a,b,c)),maxPiece(n-c,a,b,c));

        if (res == -1){
            return -1;
        }

        return res+1;
    }
}
