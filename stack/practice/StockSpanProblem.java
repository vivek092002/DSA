package com.DSA.stack.practice;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] arr = {13,15,12,14,16,8,6,4,10,30};
        int n = arr.length;
        printSpan(arr,n);
    }

    public static void printSpan(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            int span = 1;
            for (int j = i-1; j >= 0 && arr[j]<=arr[i] ; j--) {
                span++;
            }
            System.out.print(span + " ");
        }
    }
}
